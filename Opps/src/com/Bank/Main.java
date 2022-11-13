package com.Bank;



public class Main extends Bank{
	public static void main(String[] args) {
		SavingAccount s= new SavingAccount(2f,2f,3000f);
		float savings =s.amount();
		CurrentAccount ca = new CurrentAccount(2500f,1200f);
		float current= ca.amount();
		float total= savings + current;
		System.out.println("Total amount available in bank is:"+total);
	}
}

