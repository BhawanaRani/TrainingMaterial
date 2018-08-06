package com.exilant.day3.AbstractFactory;

public class FactoryProducer {
//if this method is not static then each and every time instance will be created and loaded in to heap and it is costly
public static AbstractFactory getFactory(String factoryName)
{
	if(factoryName.equals("vichle")) 
		     return new ViechleFactory();
	else if(factoryName.equals("color"))
		     return new ColorFactory();
	else
	          return null;
}
}
