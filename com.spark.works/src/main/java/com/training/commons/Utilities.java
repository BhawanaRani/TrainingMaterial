package com.training.commons;

import org.apache.spark.api.java.JavaRDD;

public class Utilities {
public static void pritStringRDD(JavaRDD<String> stringRDD,int limit) {
	for(String temp:stringRDD.take(limit)) {
		System.out.println(temp);
	}
	System.out.println("==================================================");
}

public static void pritStringRDD1(JavaRDD<Integer> stringRDD,int limit) {
	for(Integer temp:stringRDD.take(limit)) {
		System.out.println(temp);
	}
	System.out.println("==================================================");
}

public static void hold() {
	while(true) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
}
