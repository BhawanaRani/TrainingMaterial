package com.exilant.day3.AbstractFactory;

public interface IVeichle {
	void move();
	void speed(int maxSpeed);
    void paint(IColor icolor);
}

class Car implements IVeichle
{

	@Override
	public void move() {
		System.out.println("Car is moving");
		
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("max speed of car is "+maxSpeed);
		
	}

	@Override
	public void paint(IColor icolor) {
		icolor.paintCar();
		
	}
	
}
