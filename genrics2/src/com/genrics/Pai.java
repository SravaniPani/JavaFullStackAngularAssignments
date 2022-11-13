package com.genrics;

class Pairs<k,v> {
k key;
v value;
Pairs(k key , v value)
{
this.key=key;
this.value=value;

}

public void setkey(k key)
{
this.key=key;
}
public void setvalue(v value)
{
this.value=value;
}
public k getkey()
{
return key ;
}
public v getvalue()
{
return value;
}

}



public class Pai
{

public static void main(String[] args)
{
Pairs <String, String> myobj= new Pairs<String , String>("1","sravs") ;
Pairs <String ,java.util.Date> myobj1=new Pairs<String , java.util.Date>("Today is",new java.util.Date());
myobj.setkey("1");
myobj.setvalue("Hello");
myobj1.setkey("Today is" );
myobj1.setvalue(new java.util.Date());
System.out.println("key :"+ myobj.getkey());
System.out.println("value :"+ myobj.getvalue());
System.out.println("key :"+ myobj1.getkey());
System.out.println("value :"+myobj1.getvalue());


}
}

