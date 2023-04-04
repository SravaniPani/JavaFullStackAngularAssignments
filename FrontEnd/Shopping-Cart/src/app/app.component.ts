import { Component, OnInit } from '@angular/core';
import { CartService } from './services/cart.service';
import { AuthService } from './_services/auth.service';
import { StorageService } from './_services/storage.service';

import { NgFor } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public searchTerm:string='';
  // searchTerm: any;
  // title(title: any) {
  //   throw new Error('Method not implemented.');
  // }
  public totalItem:number=0;
  // title = 'Shopping-Cart';
  private roles: string[] ;
  isLoggedIn = false;
  showAdminBoard = false;
  username: string;
  // cartservice: any;

  constructor(private storageService: StorageService,private cartService:CartService,private router:Router) { }

  ngOnInit(): void {
    this.cartService.getprdt().subscribe(res=>{
      this.totalItem=res.length;
    })

    this.isLoggedIn = !!this.storageService.getToken();
    this.showAdminBoard = !!this.storageService.getToken();

    if (this.isLoggedIn) {
      const user = this.storageService.getUser();
      this.roles = user.roles;

      this.showAdminBoard = this.roles.includes('ROLE_ADMIN');
      
      this.username = user.username;
    }
    if(this.showAdminBoard){
      this.router.navigate(['product-list'])
      
    }

    if(!this.showAdminBoard){
      this.router.navigate(['/home'])
      
    }

  }
  search(event:any){
    this.searchTerm=(event.target as HTMLInputElement).value;
     console.log(this.searchTerm);
     this.cartService.search.next(this.searchTerm);
    }

  logout():void{
    this.storageService.signOut();
    window.location.reload();
  }
}
