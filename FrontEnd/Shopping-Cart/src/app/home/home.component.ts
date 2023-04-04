import { Component, OnInit } from '@angular/core';
import { CartService } from '../services/cart.service';
import { StorageService } from '../_services/storage.service';
import { UserService } from '../_services/user.service';
import { HomeService } from './homeservice/home.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
  
})
export class HomeComponent implements OnInit {
  // ngOnInit(): void {
  //   throw new Error('Method not implemented.');
  // } 
  searchKey:string="";
  serchCat:string ="";
  public productList:any;//public totalItem:number=0;    
  // isLoggedIn: boolean;
   constructor(private homeservice:HomeService,private cartservice:CartService, private storageService:StorageService){} 
   ngOnInit(): void {
     this.homeservice.getprod() .subscribe(res=>{
      this.productList=res;
      //to show quantity and price      
      this.productList.forEach((a:any)=>{
         Object.assign(a,{quantity:1,total:a.price})
         //to show the no.when cart is added   
        // this.cartservice.getprdt()      
           // .subscribe(res=>{        
            //   this.totalItem=res.length;   
             // })
       })
      })
     
      this.cartservice.search.subscribe((val:any)=>{
         this.searchKey=val;
         }
         )
      this.cartservice.search.subscribe((val:any)=>{
          this.serchCat=val;
          })}
      
     addtocart(item:any){
         this.cartservice.addtoCart(item)
         }
  
  
        }
