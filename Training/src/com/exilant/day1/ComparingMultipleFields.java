package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingMultipleFields {

	public static void main(String[] args) {
		List<Customer> customers=Arrays.asList(
				new Customer(101, "Sunita", 4500, "Engineer",25000),
				new Customer(102, "Anita", 3500, "Teacher",40000),
				new Customer(103, "Bhawana", 7000, "Developer",35000),
				new Customer(104, "Tanmayee", 6000, "Developer",40000),
				new Customer(105, "Pooja", 2000, "Developer",25000),
				new Customer(106, "Pooja", 10000, "Developer",15000)
			
				);
		
		
		Collections.sort(customers,Comparator.comparing(Customer::getCustomerName)
				.thenComparing(Customer::getSalary));
		
		
		
		customers.forEach(n->System.out.println(n));
	}

}
