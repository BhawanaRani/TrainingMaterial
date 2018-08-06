package com.exilant.day4.bridgePattern;

public class Blue implements IColor{

	@Override
	public void applyColor() {
		System.out.println("painted with Blue color");
		
	}

	@Override
	public String toString() {
		return "Blue";
	}
	
	

}
