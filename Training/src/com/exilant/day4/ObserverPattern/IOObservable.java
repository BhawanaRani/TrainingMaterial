package com.exilant.day4.ObserverPattern;
//on which the observer is interested
public interface IOObservable {
	
	public void addUser(Observer observer);
	public void remove(Observer observer);
	
	
	//who all are in the list
	public void notifyObserver();

}
