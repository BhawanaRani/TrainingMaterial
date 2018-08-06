package com.exilant.day3.Singleton;

import java.io.Serializable;

//singleton  way have only  one object
//to do that we will have variable as static
//one reference...we have two types in singleton 1)eager singleton 2)lazy singleton

//cons of eager singleton:-either the instance is needed or not one copy always kept in jvm

public class Singleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7181529831419677843L;
	private static final Singleton a=new Singleton();
	
	private Singleton() {
		System.out.println("calling constructor");
	}
	public static Singleton getResource() {
		return a;
	}

	
	
	//we should have private constructor to that ...which can;t b acceptable by outside world
	
	
	
	
	//to stop  creating instance which is already exists
	//this is only the objectOutPutStream
	protected Object readReslover() {
		return getResource();
		
	}
	
}
