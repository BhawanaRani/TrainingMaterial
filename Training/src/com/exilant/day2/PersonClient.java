package com.exilant.day2;

import java.util.Arrays;
import java.util.List;

public class PersonClient {
public static void main(String[] args) {
	List<Person> personList=Arrays.asList(
			new Person(101,"Gautam"),
			new Person(102,"Sidharth"),
			new Person(103,"Chandni"),
			new Person(104,"Rupa")
			);
	PersonConsumer consumer=new PersonConsumer();
	personList.forEach(consumer);
}
}
