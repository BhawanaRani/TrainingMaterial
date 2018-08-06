package com.spark.works;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class ReadMovieTweets {

	public static void main(String[] args) {
		String appName="sampleApp";
		String sparkMaster="local[2]";//instance of spark 
		
		
		
		JavaSparkContext spContext=null;
		
		SparkConf conf=new SparkConf().setAppName(appName).setMaster(sparkMaster);
		
		//to get rdd
		spContext=new JavaSparkContext(conf);
		
		
		//read the file into rdd
		
		//rdd can store either string,collection etc
		
		
		JavaRDD<String> tweetsRDD=spContext.textFile("./data/movietweets1");
		//take 5 records
		tweetsRDD.take(5).forEach(System.out::println);
		
		
		//count the number of tweets
		
		int count=(int)tweetsRDD.count();
		
		System.out.println("Number of tweets are:"+count);
		
		
		JavaRDD<String> upperCaseRDD=tweetsRDD.map(temp->temp.toUpperCase());
		
		
		upperCaseRDD.take(10).forEach(System.out::println);
		
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
