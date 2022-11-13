package com.collection;

import java.util.*;
import java.util.TreeSet;
class TreeSet1
{    int id;
    String name;
    String Department;
    int salary;





   public TreeSet1(int id, String name, String Department, int salary)




    {
        this.id=id;
        this.name=name;
        this.Department=Department;
        this.salary=salary;
    }





   public String toString()
    {



       return "Treeset{" +"id="+id+   ",name='"+name+'\''+  ",salary="+salary+     " , Department='"+Department+             '}';




    }




}




class  Sortbyid implements Comparator<TreeSet1>
{
    public int compare(TreeSet1 a,TreeSet1 b) { return a.id-b.id;}



}




class  Sortbysalary implements Comparator<TreeSet1>
{    public int compare(TreeSet1 a,TreeSet1 b) { return a.salary-b.salary;}



}
class sortbyDepartment implements Comparator
{
    public int compare(Object str1 , Object str2)
    {
        String i1 =str1.toString();
        String i2 =str2.toString();
        return i2.compareTo(i2);
    }



}
class Sortbyname implements Comparator



{    public int compare(Object str1,Object str2)



{
    String i1=str1.toString();
    String i2=str2.toString();
    return i2.compareTo(i2);



}
}

class Treesetexample {




    public static void main(String[] args) {



       Scanner s = new Scanner(System.in);
        TreeSet1 t1 = new TreeSet1(1, "a", "B", 10000);
        TreeSet1 t2 = new TreeSet1(2, "b", "c", 20000);
        TreeSet1 t3 = new TreeSet1(3, "c", "a", 30000);
        TreeSet1 t4 = new TreeSet1(4, "d", "j", 40000);
        TreeSet1 t5 = new TreeSet1(5, "e", "k", 50000);
        TreeSet1 t6 = new TreeSet1(6, "f", "l", 60000);
        TreeSet1 t7 = new TreeSet1(7, "g", "m", 70000);
        TreeSet1 t8 = new TreeSet1(8, "h", "n", 80000);



       TreeSet1 t9 = new TreeSet1(9, "i", "o", 90000);
        TreeSet1 t10 = new TreeSet1(10, "j", "p", 100000);
        System.out.println("choose 1 for name/n choose 2 for department /n choose 3 for salary/n choose 4 for id");
        int choose = s.nextInt();
        switch (choose) {
        case 1:
            TreeSet<TreeSet1> s1 = new TreeSet<>(new Sortbyid());
            s1.add(t1);
            s1.add(t2);
            s1.add(t3);
            s1.add(t4);
            s1.add(t5);
            s1.add(t6);
            s1.add(t7);
            s1.add(t8);
            s1.add(t9);
            s1.add(t10);
            System.out.println(s1);
            break;
        case 2:
            TreeSet<TreeSet1> s2 = new TreeSet<>(new Sortbysalary());
            s2.add(t1);



           s2.add(t2);
            s2.add(t3);
            s2.add(t4);
            s2.add(t5);



           s2.add(t6);
            s2.add(t7);
            s2.add(t8);
            s2.add(t9);
            s2.add(t10);
            System.out.println(s2);
            break;



       case 3:



           TreeSet<TreeSet1> s3 = new TreeSet<>(new Sortbyname());
            s3.add(t1);
            s3.add(t2);
            s3.add(t3);
            s3.add(t4);
            s3.add(t5);
            s3.add(t6);
            s3.add(t7);
            s3.add(t8);
            s3.add(t9);
            s3.add(t10);
            System.out.println(s3);
            break;
    }
}

}

        
        
        

