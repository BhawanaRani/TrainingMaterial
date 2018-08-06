package com.training;

import java.io.IOException;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;

public class GetImage {
public static void main(String[] args) throws IOException {
	MongoClient mongoClient=new MongoClient("localhost",27017);
	DB db=mongoClient.getDB("tanu");
	
	String path="/Users/bhawana.r/Desktop/DBimages/";
	
	GridFS gfs=new GridFS(db,"my image");
	List<GridFSDBFile> list=gfs.find(new BasicDBObject());
	
	for(GridFSDBFile file:list)
	{
		file.writeTo(path+file.getFilename());
	}
	
	System.out.println("restored images from mongodb");
	
	
	mongoClient.close();
}
}
