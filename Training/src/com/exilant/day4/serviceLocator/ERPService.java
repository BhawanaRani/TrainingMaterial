package com.exilant.day4.serviceLocator;

public class ERPService implements Service{
	@Override
	public String getName() {
		
		return "erp";
	}

	@Override
	public void execute() {
		System.out.println("we are executing ERP service");
		
	}

}
