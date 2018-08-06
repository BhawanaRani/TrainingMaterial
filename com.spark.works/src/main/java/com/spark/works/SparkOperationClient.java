package com.spark.works;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;

import com.training.commons.DataSource;
import com.training.commons.SparkConnections;
import com.training.commons.Utilities;

public class SparkOperationClient {

	public static void main(String[] args) {
		//org is root of dir
		Logger.getLogger("org").setLevel(Level.ERROR);
		//optional
		Logger.getLogger("akka").setLevel(Level.ERROR);
      
		
		JavaSparkContext sparkContext=SparkConnections.getContext();
		
		//start loading the data
		//1.load conn and cache
		
		JavaRDD<Integer> collData=DataSource.getCollData();
		System.out.println("Total Number of Records :"+collData.count());
		
		//2.load the file and cache it
		JavaRDD<String> autoDataContent=sparkContext.textFile("./data/auto-data");
		
		
		
		//number of records
		
		System.out.println("number of records: "+autoDataContent.count());
		
		
		//print 5 lines of data
		
		//autoDataContent.take(5).forEach(System.out::println);
		
		
		JavaRDD<String> tsv=autoDataContent.map(temp->temp.replace("\t",","));
		Utilities.pritStringRDD(tsv, 10);
		
		
		//storing RDDs
		
	//	autoDataContent.saveAsTextFile("data/auto-data-modified.csv");
		
		
		
		//Filter Example
		
		
		//to remove header
		
		String header=autoDataContent.first();
		
		JavaRDD<String> autoDataWithoutHeader=autoDataContent.filter(s->!s.equals(header));
		Utilities.pritStringRDD(autoDataWithoutHeader, 10);
		
		JavaRDD<String> toytaCars=autoDataContent.filter(s->s.contains("toyota"));
		
		
		System.out.println("============ONLY TOYOTA CARS================");
		Utilities.pritStringRDD(toytaCars, 10);
		
		
		
		//all elements
		System.out.println("============All Records================");
		
		Utilities.pritStringRDD(autoDataContent,100);
		
		//unique records
		System.out.println("============Distinct Records================");
		JavaRDD<String> uniqueRec=autoDataContent.distinct();
		Utilities.pritStringRDD(uniqueRec, 10);
		
		//flat map ...give any parameter and u can perform any operations
		
		JavaRDD<String> words=toytaCars.flatMap(new FlatMapFunction<String, String>() {
			@Override
			public Iterator<String> call(String t) throws Exception
			{
				return Arrays.asList(t.split("\t")).iterator();
			}
		});
		
		System.out.println("toyotaRDD word count :"+words.count());
		
		
		
		
		//after cleansing the data
		System.out.println("==================AFTER CLEANSING THE DATA===================");
	//	JavaRDD<String> cleansRDD=autoDataContent.map(new ClenseRDDCars());
	//	Utilities.pritStringRDD(cleansRDD, 5);
		
		
		
		//set operation from diff diff RDDs
		
		JavaRDD<String> words1=sparkContext.parallelize(Arrays.asList("hello","how","are","you","today"));
		
		
		JavaRDD<String> words2=sparkContext.parallelize(Arrays.asList("hello","how","were","yesterday"));
		
		
		System.out.println("UNnion Operation -SET");
		
		
		Utilities.pritStringRDD(words1.union(words2),9);
		
		
System.out.println("Intersection Operation -SET");
		
		
		Utilities.pritStringRDD(words1.intersection(words2),9);
		
		
		
		//find sum of num in given RDD
         Integer collDataCount=collData.reduce((x,y)->x+y);
         
         
         System.out.println("Sum of Given Integer "+collDataCount);
         
         Double cleansRDD1=autoDataWithoutHeader.map(new ClenseRDDCars()).collect().stream().mapToInt(x->x).average().getAsDouble();
        // Integer sum=cleansRDD1.
       //  Double avg=(double) (cleansRDD1.reduce((x,y)->x+y)/cleansRDD1.count());
        // Integer collDataCount=cleansRDD1.reduce((x,y)->x+y);
      // Utilities.pritStringRDD1(cleansRDD1, 5);
       System.out.println("avg:"+cleansRDD1);
         //System.out.println("avg:"+avg);
         //  Double avgCityMilege=cleansRDD.
	
       
     //  Integer totalMPG=autoDataWithoutHeader.map(new MPGWorks())
	
	}

}
