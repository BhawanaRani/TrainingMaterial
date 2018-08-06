package com.training;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class QueryData {

	public static void main(String[] args) {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db=mongoClient.getDB("tanu");
		DBCollection dbCollection=db.getCollection("emp");
		
		DBObject queryCondition=new BasicDBObject("id",1011 );
	
		DBObject queryCOndition1=new BasicDBObject("department",-1);
		DBCursor dbCursor=dbCollection.find(queryCondition).sort(queryCOndition1).limit(2);
		
		while(dbCursor.hasNext())
		{
			DBObject obj=dbCursor.next();
			//System.out.println(JSON.serialize(obj));
			System.out.println(obj.get("id"));
			System.out.println(obj.get("name"));
//			System.out.println(obj.get("department"));
//			System.out.println(obj.get("salary"));
//			System.out.println("-----------------------------------------");
		}
		
		

	}

}
