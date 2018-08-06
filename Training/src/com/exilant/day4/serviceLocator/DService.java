package com.exilant.day4.serviceLocator;

public class DService implements Service{

	@Override
	public String getName() {
		
		return "DB";
	}

	@Override
	public void execute() {
		System.out.println("we are executing db service");
		
	}

}
