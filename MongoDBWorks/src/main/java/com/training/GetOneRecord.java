package com.training;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetOneRecord {

	public static void main(String[] args) {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db=mongoClient.getDB("tanu");
		DBCollection dbCollection=db.getCollection("emp");
		
		
		
		DBObject myObj=dbCollection.findOne();
		
		System.out.println("Emp ID:"+myObj.get("id"));
		System.out.println("Department:"+myObj.get("department"));
		System.out.println("Salary:"+myObj.get("salary"));
		
		
		
		
	}

}
