package com.exilant.day3.Singleton;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton=Singleton.getResource();


		//shall give the storage location or reference
		System.out.println(singleton.hashCode());

		
		Singleton singleton1=Singleton.getResource();


		//shall give the storage location or reference
		System.out.println(singleton1.hashCode());
		
		Singleton singleton3=Singleton.getResource();


		//shall give the storage location or reference
		System.out.println(singleton3.hashCode());
	}

}
