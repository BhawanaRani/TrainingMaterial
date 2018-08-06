package com.exilant.day4.bridgePattern;

public class Client {

	public static void main(String[] args) {
	Triangle triangle=new Triangle(new Red());
	triangle.applyColor();
	
	
	Pentagon pentagon=new Pentagon(new Blue());
	pentagon.applyColor();

	}

}
