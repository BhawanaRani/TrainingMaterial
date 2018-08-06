package com.exilant.day4.FilterPattern;

import java.util.HashSet;
import java.util.List;

public class OrCriteria implements ICriteria{
	public ICriteria firstCriteria;
	public  ICriteria secondCriteria;
	
	
	
	public OrCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}
	
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstList=firstCriteria.meetCriteria(persons);
		List<Person> secondList=secondCriteria.meetCriteria(persons);
		HashSet<Person> list=new HashSet<>();
		list.addAll(firstList);
		list.addAll(secondList);
		
		
		firstList.clear();
		firstList.addAll(list);
		return firstList;
	}
	
	
	
}
