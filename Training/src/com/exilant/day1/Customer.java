package com.exilant.day1;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int customerPurchases;
	private String designation;
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getCustomerId() {
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
	public int getCustomerPurchases() {
		return customerPurchases;
	}
	public void setCustomerPurchases(int customerPurchases) {
		this.customerPurchases = customerPurchases;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPurchases="
				+ customerPurchases + ", designation=" + designation + ", salary=" + salary + "]";
	}
	public Customer(int customerId, String customerName, int customerPurchases, String designation, double salary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPurchases = customerPurchases;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	
	
}
