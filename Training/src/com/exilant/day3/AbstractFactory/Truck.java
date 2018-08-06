package com.exilant.day3.AbstractFactory;

public class Truck implements IVeichle {

	@Override
	public void move() {
		System.out.println("Truck is moving");

	}

	@Override
	public void speed(int maxSpeed) {
		
	}

	@Override
	public void paint(IColor icolor) {
		icolor.paintCar();
		
	}

}
