package com.anno;
import java.lang.annotation.*;



@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface info {
	
	
	int AuthorID();
	String Author();
	String Supervisior();
	String Date();
	String Time();
	double version();
	
	
	
	
}
@info(AuthorID=123, Author="Sravani", Supervisior="Shilpa", Date="04-11-2022", Time="12.10", version=1.0)
class Person

{
	int size;
	String Date;
	String Time;
	double Version;
	
	
	public Person(int i, String string, String string2, double d) {
		// TODO Auto-generated constructor stub
}


	public void person(int size, String Date, String Time, double Version){
		 this.size = size;
	        this.Date = Date;
	        this.Time = Time;
	        this.Version = Version;
	        
	        
	}
	
}

public class AuthorDetails {
	
		public static void main(String[] args) {
			Person obj=new Person(1, "4-11-22", "1.04", 4.06);
			Class c=obj.getClass();
			Annotation annotation2 = c.getAnnotation( info.class);
			info i=(info)annotation2;
			System.out.println(i.AuthorID());
			System.out.println(i.Author());
			System.out.println(i.Supervisior());
			System.out.println(i.Date());
			System.out.println(i.Time());
			System.out.println(i.version());
			
			
			
			
			
			
			
		
		
		
	}

}
