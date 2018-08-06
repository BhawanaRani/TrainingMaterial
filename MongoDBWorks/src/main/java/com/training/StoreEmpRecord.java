package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class StoreEmpRecord {
	public static void main(String[] args) {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db=mongoClient.getDB("tanu");
		DBCollection dbCollection=db.getCollection("emp");
		
		//first way
		DBObject obj=new BasicDBObject();
		obj.put("id", 8888);
		obj.put("name", "Kavita");
		obj.put("department", "IT");
		obj.put("salary",7800);
		
		//dbCollection.save(obj);
		
		
		//second way
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("id", 9999);
		map.put("name", "kriti");
		map.put("department", "IT");
		map.put("salary",78000);
		
	//	dbCollection.save(new BasicDBObject(map));
		
		
		//third way
		
		String jsonStr="{id:3444,name:'Geeta',department:'IT',salary:45000}";
		
		//dbCollection.save((DBObject) JSON.parse(jsonStr));
		
		//forth way ....to store bean directly
		
		
		
		Employee emp=new Employee();
		
		emp.setId(1567);
		emp.setName("anju");
		emp.setDep("Fashion Technology");
		emp.setSalary(30000.00);
		
		dbCollection.save(emp);
		
		
		
	}
}
