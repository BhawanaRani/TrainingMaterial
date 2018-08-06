package com.exilant.day2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonClient {

	public static void main(String[] args) {
		List<Dragons> dragons=Stream.of( 
				new Dragons("Errol","USA",15),
				new Dragons("Errol","USA",35),
				new Dragons("Firman","USA",12),
				new Dragons("Hasal","France",25),
				new Dragons("IceFir","France",25)
				).collect(Collectors.toList());
		
		
		//to find number of Dragons
		Map<String,Long> mapDragonCount=dragons.stream().collect(Collectors.groupingBy(Dragons::getName,Collectors.counting()));
		System.out.println(mapDragonCount);
		
		
    //find the sum of dragons based on names
		Map<String,Integer> mapDragonCount1=dragons.stream().collect(Collectors.groupingBy(Dragons::getName,Collectors.summingInt(Dragons::getCount)));
		//System.out.println(mapDragonCount1);
		mapDragonCount1.forEach(
				(k,v)->
				{
					System.out.println("Dragon Name:"+k);
					System.out.println("Number of Dragons:"+v);
				}
				
				);
		
		
		//to find the average 
		Double mapDragonAvg=dragons.stream().collect(Collectors.averagingInt(Dragons::getCount));
		System.out.println(mapDragonAvg);
		
		Optional<Dragons> min=dragons.stream().collect(Collectors.minBy(Comparator.comparing(Dragons::getCount)));
		
		System.out.println(min);
	
		
		
Optional<Dragons> max=dragons.stream().collect(Collectors.maxBy(Comparator.comparing(Dragons::getCount)));
		
		System.out.println(max);
	
		//find dragons by country and keep dragon of different contry in list
	Map<String,Set<String>> list=	dragons.stream().collect(Collectors.groupingBy(Dragons::getCountry,Collectors.mapping(Dragons::getName, Collectors.toSet())));
	
	
	list.forEach(
			(k,v)->
			{
				System.out.println("Country Name:"+k+" Dragons:"+v);
			}
			
			);
	}
	
	
	

}
