package com.exilant.day4.bridgePattern;



public class Triangle extends Shape {

	public Triangle(IColor color) {
		//since super class have constructor so we have to call it
		super(color);
	}

	@Override
	public void applyColor() {
   System.out.println("Triangle is applied with color:"+getColor());	
   getColor().applyColor();
	}

}
