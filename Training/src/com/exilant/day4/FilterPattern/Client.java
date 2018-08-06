package com.exilant.day4.FilterPattern;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;

public class Client {
public static void main(String[] args) {
	List<Person> list=new ArrayList<>();
	
	
	list.add(new Person("Deepika","female","single"));
	list.add(new Person("Rahul","male","married"));
	list.add(new Person("Vinay","male","single"));
	list.add(new Person("Meeta","female","married"));
	list.add(new Person("Hemant","male","single"));
	
	
	
	ICriteria maleCriteria=new Male();
	
	
	System.out.println("---------------Only Male-----------------");
	maleCriteria.meetCriteria(list).forEach(System.out::println);
	
	
ICriteria femaleCriteria=new Female();
	
	
	System.out.println("---------------Only Female-----------------");
	femaleCriteria.meetCriteria(list).forEach(System.out::println);
	
	
ICriteria married=new Married();
	
	
	System.out.println("---------------Only Female-----------------");
	married.meetCriteria(maleCriteria.meetCriteria(list)).forEach(System.out::println);
	

ICriteria marriedCriteria=new Married();
System.out.println("---------------Only Married-----------------");
marriedCriteria.meetCriteria(list).forEach(System.out::println);
ICriteria orCriteria=new OrCriteria(maleCriteria, marriedCriteria);
System.out.println("---------------male or married----------------");
orCriteria.meetCriteria(list).forEach(System.out::println);

ICriteria andCriteria=new OrCriteria(maleCriteria, marriedCriteria);
System.out.println("---------------Male and Married----------------");
andCriteria.meetCriteria(list).forEach(System.out::println);



}
}
