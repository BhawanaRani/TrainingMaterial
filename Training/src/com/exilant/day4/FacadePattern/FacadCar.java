package com.exilant.day4.FacadePattern;

public class FacadCar {
private HatchPack hpc;
private Sedan sedan;
private SUV suv;


public FacadCar() {
	this.hpc =new HatchPack();
	this.sedan = new Sedan();
	this.suv = new SUV();
}

public void hatchBackDriver()
{
	hpc.drive();
}

public void sedanDriver()
{
	sedan.drive();
}
public void suvDriver()
{
	suv.drive();
}
}
