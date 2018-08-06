package com.exilant.day4.bridgePattern;



public class Pentagon extends Shape{

	public Pentagon(IColor color) {
		super(color);
	}

	@Override
	public void applyColor() {
	System.out.println("Pentagon is applied with color:"+getColor());	
	getColor().applyColor();
	}
	

}
