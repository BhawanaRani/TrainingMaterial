package com.exilant.day4.ObserverPattern;

import java.util.Observable;

public class Client {
public static void main(String[] args) {
	IOObservable observable=new OnePlus6T();
	
	
	Observer user=new User(observable,"Kriti");
	Observer user1=new User(observable,"Raman");
	Observer user2=new User(observable,"Bhawana");
	Observer user3=new User(observable,"Neha");
	Observer user4=new User(observable,"Jasleen");
	
	observable.addUser(user);
	observable.addUser(user1);
	observable.addUser(user2);
	observable.addUser(user3);
	observable.addUser(user4);
	
	
	((OnePlus6T)observable).setArrived(true);
	
}
}
