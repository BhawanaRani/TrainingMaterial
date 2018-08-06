package com.exilant.day2;

public class ExilantEmployee implements IEmployee,IDepartment{

	@Override
	public void salary() {
		System.out.println("salary of Employee");
		
	}

	@Override
	public void workingHours() {
	System.out.println("working hours");
	}

	@Override
	public void workLocation() {
		System.out.println("work location:bangalore");
		
	}

}
