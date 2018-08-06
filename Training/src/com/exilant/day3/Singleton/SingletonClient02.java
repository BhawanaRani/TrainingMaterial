package com.exilant.day3.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClient02 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		
		
		Singleton singleton=Singleton.getResource();
		Singleton singleton1=null;
		Singleton singleton2=null;
		
		
		
		Constructor[] constructors=Singleton.class.getDeclaredConstructors();
		
		
		//Access Private methods  and constructors etc
		for(Constructor constructor:constructors)
		{
			constructor.setAccessible(true);
			singleton1=(Singleton)constructor.newInstance();
			singleton2=(Singleton)constructor.newInstance();
			break;
		}
   System.out.println(singleton1.hashCode());
   System.out.println(singleton2.hashCode());
	}

}
