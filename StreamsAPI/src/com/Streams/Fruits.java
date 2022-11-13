package com.Streams;
import java.util.*;
public class Fruits
{
	int calories; 
	String name;
	int price;
	String color;
	public Fruits(int calories, String name, int price, String color)
	{
		this.calories = calories; 
		this.name = name; 
		this.price = price;
		this.color = color; 
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getCalories()
	{
		return calories;
	}
	public void setCalories(int calories)
	{
		this.calories = calories;
	}
	public int getPrice()
	{
		return price; 
	}
	public void setPrice(int price)
	{
		this.price = price; 
	}
	public String getColor()
	{
		return color; 
	}
	public void setColor(String color)
	{
		this.color = color; 
	}
	}
 class StreamsProgram1
 {
	 public static void main(String[] args)
	 {
		 ArrayList <Fruits> fruitList = new ArrayList <Fruits>();
		 fruitList.add(new Fruits(100,"apple",40,"red"));
		 fruitList.add(new Fruits(100,"orange",20,"orange"));
		 fruitList.add(new Fruits(50,"Grapes",30,"Green"));
		 fruitList.add(new Fruits(90,"Mango",50,"yellow"));
		 System.out.println("List of fruits sorted by calories");
		 fruitList.stream().filter(f->f.calories<100).forEach(f->System.out.println(f.calories));
		 System.out.println("color wise fruit names");
		 fruitList.stream().sorted(new Comparator<Fruits>()
		 {
			 @Override 
			 public int compare(Fruits o1, Fruits o2)
			 {
				 return o1.getColor().compareTo(o2.getColor()); 
			}
			})
		 .forEach(f->System.out.println(f.getName()));
		 System.out.println("List of fruits which are red sorted by price:");
		 fruitList.stream().filter(f->f.getColor().equalsIgnoreCase("red")).sorted((Fruits o1,Fruits o2)->(int)o1.getPrice()-o2.getPrice()).forEach(f->System.out.println(f.getName())); 
		 } 
	 }