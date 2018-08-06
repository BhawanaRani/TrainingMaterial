package com.exilant.day3.MVCPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employee emp=new Employee(101,"Deepika");
 StarView view =new StarView();
 
 EmployeeController controller=new EmployeeController(emp, view);
 controller.updateView("star");
	}

}
