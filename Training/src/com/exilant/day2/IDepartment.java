package com.exilant.day2;

public interface IDepartment {
public void workLocation();
public default void workingHours()
{
	System.out.println("project demands to work till 7PM");
}
static void commonUtility()
{
	System.out.println("All Employee has to pass background verification");
}
}
