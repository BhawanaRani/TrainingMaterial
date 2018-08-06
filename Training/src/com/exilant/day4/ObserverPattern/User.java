package com.exilant.day4.ObserverPattern;

public class User implements Observer{
	private IOObservable observable=null;
	private String name;
	
	
	//constuctor is the mapper between the enduser and the notification (product)
	
	public User(IOObservable obs,String s)
	{
		this.observable=obs;
		this.name=s;
	}
	
	
	public void buyMobile()
	{
		System.out.println("I have bought Oneplus6T by "+name);
	}


	@Override
	public void update() {
		buyMobile();
		
	}
	public void unSubscribed()
	{
		observable.remove(this);
	}

}
