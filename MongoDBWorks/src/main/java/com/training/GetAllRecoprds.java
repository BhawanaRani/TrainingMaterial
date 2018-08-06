package com.training;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetAllRecoprds {
public static void main(String[] args) {
	MongoClient mongoClient=new MongoClient("localhost",27017);
	DB db=mongoClient.getDB("tanu");
	DBCollection dbCollection=db.getCollection("emp");
	
	System.out.println("All Records:::::::::::::::::::::::::::::::::::::");
	
	for(DBObject myObj:dbCollection.find())//returns DBCursor
	{
		System.out.println(myObj.get("id"));
		System.out.println(myObj.get("name"));
		System.out.println(myObj.get("department"));
		System.out.println(myObj.get("salary"));
		System.out.println("-----------------------------------------");
	}
	
	
	//DBCursor=dbCollection.find();
	
}
}
