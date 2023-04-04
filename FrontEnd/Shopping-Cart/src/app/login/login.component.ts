import { Component } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { AuthService } from '../_services/auth.service';
import { StorageService } from '../_services/storage.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private authService:AuthService,private storageService: StorageService,
    private router:Router) { }
  
  ngOnInit(): void {
    if (this.storageService.getToken()) {
      this.isLoggedIn = true;
      this.roles = this.storageService.getUser().roles;
    }
  }
  userlogin:any = {
     username:'',
     password:''
    };
  isLoggedIn = false;
  isLoginFailed = false;
  errorMessage = '';
  roles: string[] = [];

//      onLogin(){
//       this.authService.login(this.userlogin).subscribe(data=>{
//         console.log(data);
//         this.router.navigate(['product']);
//       })
//     }
   
// }

onLogin(){
  
  this.authService.login(this.userlogin).subscribe(                        //(username, password).subscribe({
    data => {
      this.storageService.saveToken(data.accessToken);
      this.storageService.saveUser(data);

      this.isLoginFailed=false;
      this.isLoggedIn=true;

      Swal.fire({
        title: 'Welcome!!',
        // text: this.username, 
        imageUrl: "../../assets/images/Best-Website-Welcome-Message-Examples.png",
        imageWidth: 400,
        imageHeight: 200,
        imageAlt: 'Custom image',
        showConfirmButton: false,
        // timer: 900000
       }) 

    
      this.roles=this.storageService.getUser().roles;
         this.reloadPage(); 
        
     
     
    },
    err=>{
      alert('Login Failed,Please provide valid credentials');
      this.errorMessage=err.error.message;
      this.isLoginFailed=true;
    }
    
  );

}

reloadPage(): void {
  window.location.reload();
}

}




