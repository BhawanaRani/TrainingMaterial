package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class StorageImage {

	public static void main(String[] args) throws FileNotFoundException {
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db=mongoClient.getDB("tanu");
		//second param is optional
		//second param will kept in named collection
		GridFS gfs=new GridFS(db,"my image");
		String path="/Users/bhawana.r/Desktop/pics";
		File folderpath=new File(path);
		
		for(File file:folderpath.listFiles())
		{
		InputStream inputstr=new FileInputStream(file);
		GridFSInputFile pic=gfs.createFile(inputstr,file.getName()) ;
		pic.setMetaData(new BasicDBObject("description","image"+file.getName()+"stored in exilant"));
		pic.save();
		
		}
mongoClient.close();
System.out.println("pic closed");
	}

}
