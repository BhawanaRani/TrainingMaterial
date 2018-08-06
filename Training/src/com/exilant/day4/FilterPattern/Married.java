package com.exilant.day4.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class Married implements ICriteria{
	@Override
	public List<Person>  meetCriteria(List<Person> persons)
	{
		
		List<Person> maleMarriedList=new ArrayList<>();
		for(Person temp:persons)
			  if(temp.getMaritalStatus().equals("married"))
				  maleMarriedList.add(temp);
		
		
		return maleMarriedList;
		
	}
}
