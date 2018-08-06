package com.exilant.day4.FilterPattern;

import java.util.List;

import javax.swing.Icon;

public class AndCriteria implements ICriteria{
public ICriteria firstCriteria;
public  ICriteria secondCriteria;
public AndCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
	
	this.firstCriteria = firstCriteria;
	this.secondCriteria = secondCriteria;
}
@Override
public List<Person> meetCriteria(List<Person> persons) {
	
	List<Person> andC=firstCriteria.meetCriteria(persons); //male
	
	List<Person> res=secondCriteria.meetCriteria(andC); //married
	return res;
	
}


}
