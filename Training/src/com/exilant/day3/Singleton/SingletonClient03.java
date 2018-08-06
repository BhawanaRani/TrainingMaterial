package com.exilant.day3.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonClient03 {
	
	
	//to  presist the data to file OS/OIS
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton s=Singleton.getResource();
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("XYZ.ser"));
		out.writeObject(s);
		System.out.println("Object saved with hashcode "+s);
		out.close();
		
		
		
		//////////////////////read a filer////////
		
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("XYZ.ser"));
		Singleton s1=(Singleton)in.readObject();
		in.close();
		System.out.println("Object recived with hashcode "+s1);
		
	}

}
