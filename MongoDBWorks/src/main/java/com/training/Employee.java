package com.training;

import com.mongodb.BasicDBObject;

public class Employee extends BasicDBObject{
private int id;
private String name;
private double salary;
private String dep;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
	this.put("id", id);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	this.put("name", name);
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
	this.put("salary", salary);
}
public String getDep() {
	return dep;
}
public void setDep(String dep) {
	this.dep = dep;
	this.put("department", dep);
}
public Employee(int id, String name, double salary, String dep) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dep = dep;
}

public Employee() {
	// TODO Auto-generated constructor stub
}



}
