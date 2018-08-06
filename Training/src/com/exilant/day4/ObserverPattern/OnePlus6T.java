package com.exilant.day4.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class OnePlus6T implements IOObservable{
private List<Observer> users;
private boolean isArrived=true;


public OnePlus6T() {
	users=new ArrayList<>();
}
	@Override
	public void addUser(Observer observer) {
		users.add(observer);
		
	}

	@Override
	public void remove(Observer observer) {
	users.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer temp:users)
		{
			temp.update();
		}
		
	}
	public boolean isArrived()
	{
		return isArrived;
	}
	
	public void setArrived(boolean isArrived)
	{
		this.isArrived=isArrived;
		notifyObserver();
	}

}
