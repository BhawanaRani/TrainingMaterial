package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.exilant.day2.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		List<Employee> employees=Arrays.asList(
				new Employee(101, "Sunita", "Team Lead",25000),
				new Employee(102, "Anita", "Tester",15000),
				new Employee(103, "Bhawana", "Developer",35000),
				new Employee(104, "Tanmayee", "Developer",40000),
				new Employee(105, "Pooja", "Developer",20000)
				);
    Predicate<Employee> greaterSalary=e->e.getSalary()>15000;
    Predicate<Employee> betweenRange=e->e.getSalary()>10000&&e.getSalary()<30000;
    
    
 List<Employee> greaterSalList=filterList(employees, greaterSalary);
	System.out.println("List of Employees greater than 15000");
greaterSalList.forEach(System.out::println);
    
    //by creating predicate using method
	 List<Employee> isDeveloperList=filterList(employees, isDeveloper());
		System.out.println("List of Developers");
		isDeveloperList.forEach(System.out::println);
//		
		
		//by using stream and passing predicate in fiter function
		List<Employee> isTesterList=filteredList(employees, e->e.getDesignation().equalsIgnoreCase("tester"));
		System.out.println("List of Tester");
		isTesterList.forEach(System.out::println);
	}

	//by using stream and passing predicate in fiter function
	public static List<Employee> filteredList(List<Employee> emp,Predicate<Employee> predicate)
	{
		return emp.stream().filter(predicate).collect(Collectors.toList());
	}
	public static List<Employee> filterList(List<Employee> employes,Predicate<Employee> predicate)
	
	{
		List<Employee> filteredList=new ArrayList<>();
		for(Employee e:employes)
		if(predicate.test(e))
			filteredList.add(e);
		return filteredList;
	}
	
	
	public static Predicate<Employee> isDeveloper()
	{
		return e->e.getDesignation().equalsIgnoreCase("developer");
	}
}
