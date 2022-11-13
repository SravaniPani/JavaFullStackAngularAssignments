package com.genrics;

import java.util.*;  
public class Hash{  
 public static void main(String args[]){  
   HashMap<Integer,Double> map=new HashMap<Integer,Double>();   
   map.put(4, 80.2);   
   map.put(6, 64.3);    
   map.put(5,79.6478);   
   map.put(9,34.7);   
       
   System.out.println("Data in hashmap");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}
}