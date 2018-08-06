package com.exilant.day3.AbstractFactory;

public abstract class AbstractFactory {
//here you will have the list of factories to be exposed
	
	
	public abstract IVeichle getVeichle(String vichle);
	public abstract IColor getColor(String color);
}
