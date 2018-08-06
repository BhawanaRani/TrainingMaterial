package com.exilant.day4.FacadePattern;

public class Client {

	public static void main(String[] args) {
		FacadCar myCar=new FacadCar();
		
		
		myCar.hatchBackDriver();
		
		myCar.sedanDriver();
		
		myCar.suvDriver();

	}

}
