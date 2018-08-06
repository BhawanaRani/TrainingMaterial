package com.exilant.day2;
//to show working of predicate

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> greaterThan=i->i>10;
		Predicate<Integer> lesserThan=i->i<10;
		Predicate<Integer> positiveInteger=i->i>0;
		Predicate<Integer> betweenRange=i->i>0&&i<100;
        System.out.println(greaterThan.test(100));
		List<Integer> intList=Arrays.asList(12,23,34,45,-33,-10,2,77,200,500,700);
		
		//passing single predicate
		List<Integer> greaterThanList=filterList(intList, greaterThan);
		System.out.println("List of numbers greater than 10");
		greaterThanList.forEach(System.out::println);
		
		
		//we can passed composed predicate
		Predicate<Integer> composedPredicate=positiveInteger.and(betweenRange);
		List<Integer> commonList=filterList(intList, composedPredicate);
		System.out.println("List of numbers which are positive and between range 0-100");
		greaterThanList.forEach(System.out::println);
	}
	//passing single predicate
public static List<Integer>  filterList(List<Integer> numbers,Predicate<Integer> predicate)
{
	List<Integer> filteredList=new ArrayList<>();
	for(Integer n:numbers)
		if(predicate.test(n))
	    	filteredList.add(n);
	
	return filteredList;
}
//we can passed composed predicate
}
