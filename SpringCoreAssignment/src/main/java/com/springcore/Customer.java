package com.springcore;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddresss;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String customerContact, Address customerAddresss) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddresss = customerAddresss;
	}
	public void show() {
		System.out.println("Customer Address:"+customerName+"Street: "+customerAddresss.getStreet());
	}
	              
	              
	/*public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddresss() {
		return customerAddresss;
	}
	public void setCustomerAddresss(Address customerAddresss) {
		this.customerAddresss = customerAddresss;
	}
	
	public void customerDetail() {
		System.out.println("Customeer Id:"+getCustomerId()+"\n");
	}
	

}*/

}
