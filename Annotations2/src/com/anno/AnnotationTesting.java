package com.anno;
import java.lang.annotation.*;

@interface Test
{
	
}

public class AnnotationTesting {
	@Test
	
	public  int testcase()

	{
		int a=30;
		return a;
		
	}
	public static void main(String [] args)
	{
		AnnotationTesting t= new AnnotationTesting();
		
		System.out.println(t.testcase());
		
	}

}
