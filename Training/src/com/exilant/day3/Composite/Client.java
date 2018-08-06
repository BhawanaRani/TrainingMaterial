package com.exilant.day3.Composite;

public class Client {

	public static void main(String[] args) {
	Customer customers=new Customer(1123, "Deepika");
	Customer customers1=new Customer(1124, "Reeta");
	Customer customers2=new Customer(1125, "Disha");
	Customer customers3=new Customer(1126, "Tanmayee");
	Customer customers4=new Customer(1127, "Chandani");
	Customer customers5=new Customer(1128, "Tejashvini");
	Customer customers6=new Customer(1130, "Pooja");
	Customer customers7=new Customer(1133, "Kavita");
	Customer customers8=new Customer(1134, "Bhawana");
	Customer customers9=new Customer(1135, "Parvati");
	
	
	customers.addReference(customers1);
	customers.addReference(customers2);
	customers.addReference(customers3);
	
	customers1.addReference(customers4);
	customers1.addReference(customers5);
	customers1.addReference(customers6);
	
	customers5.addReference(customers7);
	customers5.addReference(customers8);
	customers5.addReference(customers9);
	
	
	System.out.println("print all the customer reference tree");
	System.out.println("Customer1's Reference "+customers.getReferences());
	
	
	for(Customer customer:customers.getReferences())
	{
		System.out.println(customer.getCustId()+" "+customer.getCustName());
	}
	}

}
