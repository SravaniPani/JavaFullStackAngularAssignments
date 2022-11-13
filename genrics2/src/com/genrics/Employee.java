package com.genrics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Employee {
	
static void displayDetails()
{       
	    Set<Integer> set1 = new HashSet<Integer>();

		set1.add(1);
        set1.add(2);
        set1.add(3);
        
        Set<String> set2 = new HashSet<String>();
        set2.add("sravani");
        set2.add("vijju");
        set2.add("ani");
        
        Set<Double> set3 = new HashSet<Double>();
        set3.add(1000.00);
        set3.add(2000.00);
        set3.add(3000.00);
        
        Set<String> set4 = new HashSet<String>();
        set4.add("StatDept");
        set4.add("MathsDept");
        set4.add("ScienceDept");


       for (Integer a : set1) 
       {
            System.out.printf("Id  :%d\n", a);
       }
       Iterator<String> b = set2.iterator();
       
       while (b.hasNext())
       {
           System.out.printf("Name :%s\n", b.next());
       }
       for(Double c : set3 )
       {
    	   System.out.printf("Sal :%f\n",c);
       }
       Iterator<String> d = set4.iterator();
       while(d.hasNext()) 
       {
    	   System.out.printf("Dep :%s\n",d.next());
       }
       
       
       
       
       
}

public static void main(String[] args)
{
 displayDetails();	
}
}
 

