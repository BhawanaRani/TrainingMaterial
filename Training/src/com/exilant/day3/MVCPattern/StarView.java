package com.exilant.day3.MVCPattern;

public class StarView {
	
	public void printEmployee(Employee emp)
{
	System.out.println("------------------------------------------------------");
	System.out.println("empID:"+emp.getEmpId()+" empName:"+emp.getEmpName());
	System.out.println();
	System.out.println();
}

}
