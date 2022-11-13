package assignments;

import java.util.Arrays;

public class Bubblesort
{
    static void bubblesort(int arr[])
    {
       int n = arr.length;
       System.out.println(n);
       //first adjacent element
       for(int i=0;i<n-1;i++)
       {
    	   //getting second adjacent element
    	   for(int j=0;j<n-i-1;j++)
    		   
    		   //comparing the elements
    		   if(arr[j]>arr[j+1])
    		   {
    			   int temp=arr[j];
    			   arr[j]=arr[j+1];
    			   arr[j+1]=temp;
    		   }
       }
    }
	

	public static void main(String[] args) 
	{
		
	    int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,87,47};
		Bubblesort.bubblesort(arr);
		System.out.println("before sorting");
		System.out.println();
		for(int ele:arr)
		{
			System.out.println(ele+" ");
		}
		
		
	}

}








//SEARCHING ELEMENT//s