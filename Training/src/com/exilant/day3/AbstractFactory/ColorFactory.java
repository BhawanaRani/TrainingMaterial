package com.exilant.day3.AbstractFactory;
//this class is acting like adaptor pattern
public class ColorFactory extends AbstractFactory {
//we should not have any implemented method for viechle  method
	@Override
	public IVeichle getVeichle(String vichle) {

		return null;
	}

	@Override
	public IColor getColor(String color) {
		
		
		if(color.equalsIgnoreCase("red"))
				return new Red();
		else if(color.equalsIgnoreCase("Blue"))
			    return new Blue();
		else
		        return null;
	}

}
