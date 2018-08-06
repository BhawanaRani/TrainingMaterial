package com.exilant.day3.Singleton;

class Company {
	private Company() {
		// the memory will be loaded in heap 
		System.out.println("Constructor called");
	}

	public static Company getInstance(Company company) {
		if (company == null)
			return new Company();
		
		else
		return company;
	}
}

class Employee {
	int empId;
	String empName;
	Company company;
}

public class SingletonClient01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = null;
		company = Company.getInstance(company); 
		
		
		Employee emp1 = new Employee();
		emp1.empId = 101;
		emp1.empName = "Bhawana";
		emp1.company = company;
		System.out.println(emp1.company.hashCode());
		
		
		
		Company company1 = null;
		company1 = Company.getInstance(company1); 
		
		
		Employee emp2 = new Employee();
		emp2.empId = 102;
		emp2.empName = "Bhawana";
		emp2.company = company1;
		System.out.println(emp2.company.hashCode());
	}

}
