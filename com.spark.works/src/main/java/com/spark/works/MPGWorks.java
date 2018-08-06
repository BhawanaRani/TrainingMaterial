package com.spark.works;

import org.apache.spark.api.java.function.Function;

public class MPGWorks implements Function<String, Integer> {
int totalMPGCity;
int totalMPGHwy;
	@Override
	public Integer call(String arg0) throws Exception {
		String[] attributeList=arg0.split("\t");
		
		
		totalMPGCity=Integer.parseInt(attributeList[9]);
		
		//totalMPGCity=Integer.parseInt(attributeList[10]);
		//return "";
		return totalMPGCity;
	}

}
