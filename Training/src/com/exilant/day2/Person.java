package com.exilant.day2;

public class Person {
private int pId;
private String name;
@Override
public String toString() {
	return "Person [pId=" + pId + ", name=" + name + "]";
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Person(int pId, String name) {

	this.pId = pId;
	this.name = name;
}

}
