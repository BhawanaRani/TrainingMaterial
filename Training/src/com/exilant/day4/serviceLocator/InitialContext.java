package com.exilant.day4.serviceLocator;

import javax.xml.bind.DataBindingException;

//it will work for any service
public class InitialContext {
public Object lookup(String jndiName) {
	if(jndiName.equalsIgnoreCase("db"))
	{
		System.out.println("looking for db service and creating");
		return new DService();
	}else if(jndiName.equalsIgnoreCase("erp"))
	{
		System.out.println("looking for ERP service and creating");
		return new ERPService();
	}
	return null;
}

}
