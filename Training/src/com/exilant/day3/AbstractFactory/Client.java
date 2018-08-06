package com.exilant.day3.AbstractFactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory vichleFactory=FactoryProducer.getFactory("vichle");
		
		
		IVeichle vichle=vichleFactory.getVeichle("car");
		vichle.move();
		vichle.speed(1000);
		
		
		IVeichle vichle1=vichleFactory.getVeichle("truck");
		vichle1.move();
		vichle1.speed(1000);
		
		
		IColor color=FactoryProducer.getFactory("color").getColor("red");
		
		IVeichle ford=vichleFactory.getVeichle("ford");
		ford.move();
		ford.speed(500);
		ford.paint(color);
	}

}
