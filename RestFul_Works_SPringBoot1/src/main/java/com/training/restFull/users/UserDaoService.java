package com.training.restFull.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
//simulating db
	
	
	
	private static List<User> users=new ArrayList<>();
	private static Integer userCount=102;
	
	static
	{
		users.add(new User(101,"Akshay Maduvinakodi Shashidhar",new Date()));
		users.add(new User(102,"Reena",new Date()));
		users.add(new User(103,"Meena",new Date()));
		users.add(new User(104,"Shruti",new Date()));
	}
	
	
	
	
	public List<User> getAllUsers()
	{
		return users;
	}
	
	
	public User saveUser(User user)
	{
		if(user.getUserId()==null) user.setUserId(++userCount);
		
		
		users.add(user);
		return user;
	}
	
	
	
	
	public User getUser(Integer userId)
	{
		for(User user:users)
		{
			if(user.getUserId()==userId)
			{
				return user;
			}
		}
		
		
	
		return null;
	}

	
	
	public String deleteUser(User user)
	{
		for(User user1:users)
		{
			if(user1.getUserId()==user.getUserId())
			{
			users.remove(user);
				return "deleted successfully";
			}
		}
		return null;
	}

	public User updateUser(User user,String name)
	{
		for(User user1:users)
		{
			if(user1.getUserId()==user.getUserId())
			{
				user.setName(name);
				return user;
			}
		}
		
		return null;
	
	}

}
