package com.exilant.day1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//to  use  comparator function as lambda expression
public class LambdaSort {
public static void main(String[] args) {
	List<Customer> customers=Arrays.asList(
			new Customer(101, "Sunita", 4500, "Engineer",25000),
			new Customer(102, "Anita", 3500, "Teacher",40000),
			new Customer(103, "Bhawana", 7000, "Developer",35000),
			new Customer(104, "Tanmayee", 6000, "Developer",40000),
			new Customer(105, "Pooja", 2000, "Developer",20000)
			);
	
	
	System.out.println("Before Sorting");
	customers.forEach(System.out::println);
	
	
	//sorting (jdk 1.7)
	Collections.sort(customers, new Comparator<Customer>() {

		@Override
		public int compare(Customer o1, Customer o2) {
			return o1.getCustomerName().compareTo(o2.getCustomerName());
		}
	});
	
	
	System.out.println("after Sorting using names");
	customers.forEach(System.out::println);
	
	
	
	//java 8

	
	customers.sort((c,d)->c.getCustomerPurchases()-d.getCustomerPurchases());
	System.out.println("after Sorting using purchases");
	customers.forEach(System.out::println);
	
	customers.sort((c,d)->c.getDesignation().compareTo(d.getDesignation()));
	System.out.println("after Sorting using designation");
	customers.forEach(System.out::println);
	
	//Comparator.reverseOrder();
	Comparator<Customer> customerByAcc=(c,d)->c.getCustomerName().compareTo(d.getCustomerName());
	System.out.println("after Sorting using names");
	customers.forEach(System.out::println);
	
	customers.sort(customerByAcc.reversed());
	System.out.println("after reverse Sorting using names");
	customers.forEach(System.out::println);
}
}
