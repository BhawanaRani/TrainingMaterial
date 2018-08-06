package com.exilant.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStreams {
public static void main(String[] args) throws IOException {
//	Files.list(Paths.get("."))
//	.map(Path::getFileName)
//	.map(Path::toString)
//	.map(String::toUpperCase)
//	.forEach(System.out::println);
//	
	
	//to fetch the files by limit and sorting order
//	Files.list(Paths.get("."))
//	.map(Path::getFileName)
//	.map(Path::toString)
//	.map(String::toUpperCase)
//	.filter(name->name.endsWith("TXT"))
//	.sorted()
//	.limit(4)
//	.forEach(System.out::println);
//	
	
	//skip 2nd file
	Files.list(Paths.get("."))
	.map(Path::getFileName)
	.map(Path::toString)
	.map(String::toUpperCase)
	.filter(name->name.endsWith("TXT"))
	.sorted()
	.skip(1)
	.limit(4)
	.forEach(System.out::println);
	
	//using action
	Files.list(Paths.get("."))
	.map(Path::getFileName)
	.map(Path::toString)
	.map(String::toUpperCase)
	.filter(name->name.endsWith("TXT"))
	.sorted()
	.skip(1)
	.limit(4)
	.forEach(n->doSomeWork(n));
	
}

private static void doSomeWork(String n) {
	// TODO Auto-generated method stub
	System.out.println("action is"+n);
}
}
