package com.exilant.day4.FilterPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Male implements ICriteria{
@Override
public List<Person>  meetCriteria(List<Person> persons)
{
	
	List<Person> malelist=new ArrayList<>();
	for(Person temp:persons)
		  if(temp.getSex().equals("male"))
			  malelist.add(temp);
	
	
	return malelist;
	
}
}
