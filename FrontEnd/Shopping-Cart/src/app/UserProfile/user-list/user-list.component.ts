import { Component } from '@angular/core';
import { UserprofileService } from 'src/app/services/userprofile.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent {

  constructor(private userprofile:UserprofileService){}
  users:any=[{
    profileId:'',
    fullName:'',
    emailId:'',
    mobileNumber:'',
    dateOfBirth:'',
    address:{
      houseNumber:'',
      streetName:'',
      colonyName:'',
      city:'',
      state:'',
      pincode:''
    }
  }]

  getuser(){
    this.userprofile.getUserDetails()
    .subscribe(data=>{
      this.users=data;
      console.log(data);
    })
  }

}
