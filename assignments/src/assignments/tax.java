package assignments;
import java.util.Scanner;

public class tax {
	public static void main(String args[])
	{ int ctc;
	  double a1=0, a2=180000;
	  double b1=180001, b2=300000;
	  double c1=300001, c2=500000;
	  double d1=500001, d2=1000000;
	  Scanner input= new Scanner(System.in);
	  System.out.println("enter ctc:");
	  ctc=input.nextInt();
	  if(ctc>a1&&ctc<a2)
	  { System.out.println("Taxation is nill");
	  
	  }
	  if(ctc>b1&&ctc<b2)
	  { System.out.println("taxiation is 10%");
		  
	  }
	  if(ctc>c1&&ctc<c2)
	  { System.out.println("taxiation is 20%");
	
	 }
	  if(ctc>d1&&ctc<d2)
	  { System.out.println("taxiation is 30%");
	  
	}

}
}
