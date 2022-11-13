package com.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;
interface RemoveDup





{





  public int removeDup(String str);
}





public class Oddlengths {





  public ArrayList<String>removeOddLength(ArrayList<String>employeeList){





      ArrayList<String>list = new ArrayList<>();
        Predicate<String>filterEmp = (p)-> {
            if(Math.floorMod(p.length(),2)==0)
                return  true;
            else
                return false;
        };
        employeeList.stream()





              .filter(filterEmp)





              .forEach(p->list.add(p));
        return  list;
    }
    public static void main(String[] args) {
        ArrayList<String>employeeList = new ArrayList<>();
        employeeList.add("Tanu");
        employeeList.add("Harika");
        employeeList.add("Sravs");
        employeeList.add("Bhagya");
        employeeList.add("Naaju");
        Oddlengths assignment4Q4 = new Oddlengths();
        System.out.println(assignment4Q4.removeOddLength(employeeList));
    }





}
