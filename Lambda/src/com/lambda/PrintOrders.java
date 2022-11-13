package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.*;

public class PrintOrders {




    
    @Override
    public String toString() {
        return "PrintOders{" +
                "totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                '}';
    }

  

    public PrintOrders(int totalPrice2, String string) {
    	
    	 this.totalPrice = totalPrice2;
         this.status = string;
		// TODO Auto-generated constructor stub
	}

	public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private int totalPrice;
    private String status;
    public static void listOfOrders(ArrayList<PrintOrders> orders) {
    	 List<PrintOrders> collect =orders.stream().filter(x -> x.getTotalPrice()>1000).collect(Collectors.toList());;
         collect.forEach(System.out::println);
        
    }
    public static void main(String[] args) {
        PrintOrders a1 = new PrintOrders(10001,"ACCEPTED");
        PrintOrders a2 = new PrintOrders(1000,"ACCEPTED");
        PrintOrders a3 = new PrintOrders(10500,"COMPLETED");
        PrintOrders a4 = new PrintOrders(100,"ACCEPTED");
        PrintOrders a5 = new PrintOrders(10002,"ACCEPTED");
        PrintOrders a7 = new PrintOrders(50000,"COMPLETED");
        ArrayList<PrintOrders> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a7);
        list.forEach(System.out::println);
        System.out.print("------------------------------");
        
		listOfOrders(list);
    }
}