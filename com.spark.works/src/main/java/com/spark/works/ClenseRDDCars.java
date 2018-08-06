package com.spark.works;

import java.util.Arrays;

import org.apache.spark.api.java.function.Function;

public class ClenseRDDCars  implements Function<String, Integer>{

	@Override
	public Integer call(String v1) throws Exception {
		String [] attributList=v1.split("\t");
		//change char to number
		
		attributList[3]=attributList[3].equals("two")?"2":"4";
		
		//to change the char to uppr case
		attributList[4]=attributList[4].toUpperCase();
		
		//return Arrays.toString(attributList);
		return Integer.parseInt(attributList[9]);
	}

}
