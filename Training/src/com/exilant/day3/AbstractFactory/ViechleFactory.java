package com.exilant.day3.AbstractFactory;

public class ViechleFactory extends AbstractFactory{

	@Override
	public IVeichle getVeichle(String vichle) {
		if(vichle.equalsIgnoreCase("car"))
			return new Car();
	else if(vichle.equalsIgnoreCase("truck"))
		    return new Truck();
	else if(vichle.equalsIgnoreCase("ford"))
	    return new Ford();
	else	
	        return null;		
	}

	@Override
	public IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
