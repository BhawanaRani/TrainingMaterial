package com.training.commons;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class DataSource {
	
	//simulating the data is pulled from some resource
public static JavaRDD<Integer> getCollData(){
	JavaSparkContext spContext=SparkConnections.getContext();
	
	
	List<Integer> data=Arrays.asList(3,5,23,100,78,65,44,00);
	JavaRDD<Integer> collData=spContext.parallelize(data);
	
	
	collData.cache();
	
	
	return collData;
}
}
