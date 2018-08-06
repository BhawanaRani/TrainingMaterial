package com.exilant.day4.serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;

	public Cache() {
		services=new ArrayList<Service>();
	}
	
	
	public Service getService(String serviceName)
	{
		
		for(Service s:services ) {
			if(s.getName().equalsIgnoreCase(serviceName))
			{
				System.out.println("REturning cache service "+serviceName+" Object");
				//return s;
			}
		}
		
		return null;
		
	}
	
	
	
	public void addService(Service newService) {
		boolean exists=false;
		for(Service service:services)
		{
			//System.out.println("");
			if(service.getName().equalsIgnoreCase(newService.getName()))
			{
				exists=true;
			}
		}
		if(!exists)   services.add(newService);
	}
	
}
