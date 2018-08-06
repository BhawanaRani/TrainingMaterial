package com.training;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class GetMetaData {

	public static void main(String[] args) {
		//localhost port 2017
		MongoClient mongoClient=new MongoClient("localhost",27017);
		System.out.println("Connection got to "+mongoClient);
		
		
		System.out.println("list of databases from mongo:");
		
		
		for(String dbName:mongoClient.getDatabaseNames())
		{
			System.out.println("\t"+dbName);
			
			DB db=mongoClient.getDB(dbName);
			
			for(String collection:db.getCollectionNames()) {
				System.out.println("\t\t"+collection);
			}
		}

	}

}
