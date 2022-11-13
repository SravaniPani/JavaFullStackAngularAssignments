package assignments;

public class intrest {
	



		   public static void main(String[] args) {
		        double si,p,r,ci,t;
		        p=30000;
		        t=3;
		        r=5;
		        si=(p*t*r)/100;
		        System.out.println("Simple Interest: "+si);
		        
		        ci=(p*(Math.pow((1+(r/100)), t)))-p;
		        String formattedCI=String.format("%.02f",ci);
		        System.out.println("Compound Interest: "+ formattedCI);



		   }



		}


