package com.exilant.day3.AbstractFactory;

public class Ford implements IVeichle{
    
	

	@Override
	public void move() {
		System.out.println("ford moving");
		
	}

	@Override
	public void speed(int maxSpeed) {
		System.out.println("speed:"+maxSpeed);
		
	}

	@Override
	public void paint(IColor icolor) {
		icolor.paintCar();
		
	}

}
