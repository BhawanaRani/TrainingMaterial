package com.exilant.day4.FilterPattern;

public class Person {
	private String name;
	private String sex;
	private String maritalStatus;
	public Person(String name, String sex, String maritalStatus) {
		
		this.name = name;
		this.sex = sex;
		this.maritalStatus = maritalStatus;
	}
	
	public Person() {
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", maritalStatus=" + maritalStatus + "]";
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getSex() {
		return sex;
	}

	protected void setSex(String sex) {
		this.sex = sex;
	}

	protected String getMaritalStatus() {
		return maritalStatus;
	}

	protected void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	

}
