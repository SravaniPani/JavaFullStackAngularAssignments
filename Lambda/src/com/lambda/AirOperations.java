package com.lambda;

@FunctionalInterface
interface Airthmetic{
	int operation(int a, int b);
}


public class AirOperations {
	
	public static void main(String args[]) {
	
	Airthmetic addition=(int a,int b)->(a+b);;
	System.out.println("Addition is:"+addition.operation(10,20));
	
	Airthmetic Substraction=(int a,int b)->(a-b);;
	System.out.println("Addition is:"+Substraction.operation(10,20));
	
	Airthmetic Multiplication=(int a,int b)->(a*b);;
	System.out.println("Multiplication is:"+Multiplication.operation(10,20));
	
	Airthmetic division=(int a,int b)->(a/b);;
	System.out.println("Division is:"+division.operation(20,20));
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
