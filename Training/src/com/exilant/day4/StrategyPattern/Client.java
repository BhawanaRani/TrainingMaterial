package com.exilant.day4.StrategyPattern;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
	public static void main(String[] args) {
	List<Item> items=Stream.of(
				new Item("ITM01-pen",30,4),
				new Item("ITM02-Monitor",600,2),
				new Item("ITM03-pencil",10,4),
				new Item("ITM04-Bottles",50,2)).collect(Collectors.toList());
		
		
		ShoppingCart cart=new ShoppingCart();
		cart.addList(items);
//		cart.addItem(new Item("ITM01-pen",30,4));
//		cart.addItem(new Item("ITM02-Monitor",600,2));
//		cart.addItem(new Item("ITM03-pencil",10,4));
//		cart.addItem(new Item("ITM04-Bottles",50,2));
	
		
		System.out.println("Total Amount"+cart.calculated());
		Payment paymentStg=new EWallet("bhawana@gmail.com", "1234", "patym");
		cart.checkOut(paymentStg);
			
	}

}
