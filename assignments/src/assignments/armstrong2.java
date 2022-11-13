package assignments;

public class armstrong2 {
	 public static void main(String[] args) {
	        int s=0,x=0,y=0,z=0,sum=0,n=999,i=0;
	        
	        for(i=100;i<n;i++) {
	            
	            s=i/10;
	            x=i%10;
	            y=s/10;
	            z=s%10;
	            x=x*x*x;
	            y=y*y*y;
	            z=z*z*z;
	            
	            sum=x+y+z;
	            if (i==sum) {
	                System.out.println(sum+" "+"is an Armstrong number");
	            }
	            
	        }



	   }



	}


