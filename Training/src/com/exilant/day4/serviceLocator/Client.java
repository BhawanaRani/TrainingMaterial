package com.exilant.day4.serviceLocator;

public class Client {
	public static void main(String[] args) {
		Service dbService=ServiceLocator.getService("db");
		dbService.execute();
		
		
		System.out.println("***************************************");
		Service erpService=ServiceLocator.getService("erp");
		erpService.execute();
		
		
		System.out.println("***************************************");
		Service db1Service=ServiceLocator.getService("db");
		db1Service.execute();
	}

}
