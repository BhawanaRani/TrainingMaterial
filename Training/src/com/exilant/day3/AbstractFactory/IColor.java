package com.exilant.day3.AbstractFactory;

public interface IColor {
void paintCar();
}
class Red implements IColor
{

	@Override
	public void paintCar() {
		System.out.println("Car painting color Blue");
	}
	
}
class Blue implements IColor
{

	@Override
	public void paintCar() {
		System.out.println("Car painting color Blue");
		
	}
	
}