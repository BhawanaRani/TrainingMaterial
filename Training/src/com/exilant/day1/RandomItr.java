package com.exilant.day1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class RandomItr {

	public static void main(String[] args) {
		//to generating one random number
    int  randomNumber=ThreadLocalRandom.current().nextInt(100,200);
    System.out.println(randomNumber);
    
    //Numbers
    Random random=new Random();
    random.ints(10, 100, 200).forEach(System.out::println);
    
    System.out.println("---------------------------------------");
    Random random1=new Random();
    random1.ints(10, 100, 200).sorted().forEach(System.out::println);
    
    
    
    //to generate andom number using stream
    System.out.println("Using Stream");
    Stream.iterate(10, i->i+1).limit(20).sorted().forEach(System.out::println);
    
	}
	
	
	

}
