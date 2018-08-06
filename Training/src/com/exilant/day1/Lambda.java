package com.exilant.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
// program to show iterations in jdk1.7 and jdk1.8
	public static void main(String[] args) {

		
		List<String> fruits=Arrays.asList("Mango","orange","apple","papaya");
		
		
		
		// how to iterate list in jdk 1.5
		System.out.println("with jdk 1.5");
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
		
		
		
		// how to iterate  list in jdk 1.7
		System.out.println("with jdk 1.7");
		for(String s:fruits)
			System.out.println(s);
		
		//how to iterate list in 1.8
		System.out.println("with jdk 1.8");
		fruits.forEach(n->System.out.println(n));
		
		
		// behind the screen of  fr each with java 8
		System.out.println("with jdk 1.8 Consumer Functional Interface");
		fruits.forEach(new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						System.out.println(t);
					}
			
				});
		
		
		//how to iterate using for each and method references in jdk 1.8
		System.out.println("with jdk 1.8 method references");
		fruits.forEach(System.out::println);
		
		
		
	//	List<Integer> fruits=Arrays.asList(10,20,30,40,50);
		
	}

}
