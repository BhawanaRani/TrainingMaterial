package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	//upto jdk1.7
	public static List<PriortyCustomer> filterCustomers(List<Customer> customers)
	{
		
		List<PriortyCustomer> priortyCustomers=new ArrayList<>();
		for(Customer c:customers)
		{
			if(c.getCustomerPurchases()>4000)
			{
				priortyCustomers.add(new PriortyCustomer(c.getCustomerId(), c.getCustomerName(),"Gold"));
			}
		}
		return priortyCustomers;
	}
	public static void main(String[] args) {
		
		List<Customer> customers=Arrays.asList(
				new Customer(101, "Sunita", 4500, "Engineer",25000),
				new Customer(102, "Anita", 3500, "Teacher",40000),
				new Customer(103, "Bhawana", 7000, "Developer",35000),
				new Customer(104, "Tanmayee", 6000, "Developer",40000),
				new Customer(105, "Pooja", 2000, "Developer",20000)
				);
		
		        System.out.println("using jdk 1.7");
				filterCustomers(customers).forEach(System.out::println);
				 System.out.println("using jdk 1.8");
				filterCustomers1(customers).forEach(System.out::println);
				System.out.println("using jdk 1.8 along with filter and map");
				filterCustomers2(customers).forEach(System.out::println);
				System.out.println("displaying all customers with their type");
				filterCustomers3(customers).forEach(System.out::println);
	}

	//upto jdk1.8
		public static List<PriortyCustomer> filterCustomers1(List<Customer> customers)
		{
			
			List<PriortyCustomer> priortyCustomers=customers.stream().map(c->
			{
				if(c.getCustomerPurchases()>4000)
					return new PriortyCustomer(c.getCustomerId(), c.getCustomerName(), "Gold");
				return null;
			}).collect(Collectors.toList());
			return priortyCustomers;
		}
		
		
		//upto jdk1.8
				public static List<PriortyCustomer> filterCustomers2(List<Customer> customers)
				{
					
					return customers.stream().filter(c->c.getCustomerPurchases()>4000).map(c->{
					return new PriortyCustomer(c.getCustomerId(), c.getCustomerName(), "Gold");}).collect(Collectors.toList());
				
				}
				
				
				//upto jdk1.8 to define all type of customers
				
				//0-3000  silver
				//3000-4999 gold
				//>5000 platanium
				public static List<PriortyCustomer> filterCustomers3(List<Customer> customers)
				{
					
					return customers.stream().map(c->{
					return new PriortyCustomer(c.getCustomerId(), c.getCustomerName(), 
							c.getCustomerPurchases()>0&&
							c.getCustomerPurchases()<3000?"Silver":
							c.getCustomerPurchases()>3000&&
							c.getCustomerPurchases()<5000?"Gold":"Platanium"
							);}).collect(Collectors.toList());
				
				}
}
