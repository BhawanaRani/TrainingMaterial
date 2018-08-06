package com.exilant.day4.bridgePattern;

public class Red implements IColor{

	@Override
	public void applyColor() {
		System.out.println("painted with Red color");
		
	}

	@Override
	public String toString() {
		return "Red";
	}
	

}
