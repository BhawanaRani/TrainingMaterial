package com.exilant.day1;

import java.util.Arrays;
import java.util.List;

public class SumOfNumber {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		
		
		int sum=0;
		//using jdk 1.7
		for(Integer s:numbers)
			sum+=s;
		
		
		System.out.println("Sum of Numbers:"+sum);
		
		
		
		
		sum=0;
		//using jdk 1.8
	//numbers.forEach();
		
		System.out.println(numbers.stream()
				.map(e->e*2)
				.reduce((res,e)->res+e) );
	}

}
