package com.exilant.day4.bridgePattern;




//this is a abstract class since reference of color is kept here
public abstract class Shape {
private IColor color;

public Shape(IColor color) {
	this.color = color;
}

protected IColor getColor() {
	return color;
}

public abstract void applyColor();
}
