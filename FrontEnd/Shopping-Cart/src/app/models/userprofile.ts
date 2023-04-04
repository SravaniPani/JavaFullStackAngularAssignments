import { Address } from "./address";

export class Userprofile {
    profileId:number;
    fullName:string;
    emailId:string;
    mobileNumber:number;
    dateOfBirth:any;
    address:Address[]=[];
}
