package assignments;

public class student {
	public static void main(String [] args) {
		int[] s1 = { 81,93,78};
		int[] s2 = {77,52,87};
		int[] s3 = {91,53,48};
		
		int tots1=0;
		int tots2=0;
		int tots3=0;
		for(int i=0;i<3;i++) {
			
			tots1= tots1+s1[i];
			tots2= tots2+s2[i];
			tots3= tots3+s3[i];
		}
		int avgs1 = tots1/3;
		int avgs2 = tots2/3;
		int avgs3 = tots3/3;
		
		System.out.println("Toyal and average score of s1:"+tots1+", "+avgs1);
		System.out.println("Toyal and average score of s1:"+tots2+", "+avgs2);
		System.out.println("Toyal and average score of s1:"+tots3+", "+avgs3);
		
		int tota= s1[0]+s2[0]+s3[0];
		int totb= s1[1]+s2[1]+s3[1];
		int totc= s1[2]+s2[2]+s3[2];
		
		int avga = tota/3;
		int avgb = totb/3;
		int avgc = totc/3;
		
		System.out.println("");
		
		System.out.println("total and avg score of student in subA: "+tota+", "+avga);
		System.out.println("total and avg score of student in subB: "+totb+", "+avgb);
		System.out.println("total and avg score of student in subC: "+totc+", "+avgc);
		


		
	}

}
