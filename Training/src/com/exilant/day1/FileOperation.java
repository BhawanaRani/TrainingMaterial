package com.exilant.day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		//writeToFile();
//writeToFile01();
		readFile();
	}
	//till 1.7
	public static void writeToFile() throws IOException
	{
		BufferedWriter br=null;
		try
		{
		br=new BufferedWriter(new FileWriter("Sample.txt"));
		br.write("hello");
		br.newLine();
		br.write("How are you");
		br.newLine();
		br.write("i am in Bangalore");
		
		
		System.out.println("data send successfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			br.close();
		}
	}
	//1.8
	public static void writeToFile01() throws IOException
	{
		try
		(BufferedWriter br=new BufferedWriter(new FileWriter("Sample1.txt")))
		{br.write("Training started");
		br.newLine();
		br.write("at mission Road");
		br.newLine();
		br.write("in Bangalore");
		}
	}
	public  static void readFile() throws FileNotFoundException, IOException
	{
		try(BufferedReader br=new BufferedReader(new FileReader("Sample1.txt")))
		{
			br.lines().forEach(System.out::println);
		}
		
	}
}
