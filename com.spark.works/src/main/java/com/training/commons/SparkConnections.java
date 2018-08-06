package com.training.commons;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public class SparkConnections {
private static String appName="sampleApp";
private static String sparkMaster="local[2]";

private static JavaSparkContext spContext=null;
private static SparkSession sparkSession=null;//to maintain the sessions


private static String tempDir="file:///Users/bhawana.r/Desktop/SparkLogs";


private static void getConnection()
{
	if(spContext==null) {
		SparkConf conf=new SparkConf().setAppName(appName).setMaster(sparkMaster);
		
		
		spContext=new JavaSparkContext(conf);
		
		//if session already exists then get it otherwise create new one
		sparkSession=SparkSession.builder().appName(appName).master(sparkMaster).config("spark.sql.warehouse.dir",tempDir).getOrCreate();
	}
}


public static JavaSparkContext getContext() {
	if(spContext==null){
	getConnection();	
	}
	return spContext;
}


public static SparkSession getSession() {
	if(sparkSession==null) {
		getConnection();
	}
	return sparkSession;
}
}
