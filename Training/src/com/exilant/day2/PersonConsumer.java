package com.exilant.day2;

import java.util.function.Consumer;

public class PersonConsumer implements Consumer<Person>{

	@Override
	public void accept(Person t) {
		System.out.println("id:"+t.getpId()+" Name:"+t.getName());
		
	}
	

}
