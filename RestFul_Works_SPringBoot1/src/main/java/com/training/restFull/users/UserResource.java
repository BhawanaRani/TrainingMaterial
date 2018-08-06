package com.training.restFull.users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userService;
	
	
	@GetMapping("users")
	public List<User> getAllUser()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{userId}")
	public User getOneUser(@PathVariable Integer userId)
	{
		return userService.getUser(userId);
	}
	
	
//	@PostMapping("/users2")
//	public ResponseEntity<Object> createUserResponseCode()
	
	
	 @PostMapping("/users1")
	 public void createUser(@RequestBody User user) {
	User savedUser = userService.saveUser(user);
	System.out.println("Saved User " + savedUser);
	 }

	 @PostMapping("/users2")
	 public ResponseEntity<Object> createUserResponseCode(@RequestBody User user) {
	 User savedUser = userService.saveUser(user);
	 URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}")
	 .buildAndExpand(savedUser.getUserId()).toUri();

	 return ResponseEntity.created(location).build();

	 }
	 
	 @PostMapping("/userUpdate")
	 public void updateUser(@RequestBody User user,@PathVariable String name) {
	User updatedUser = userService.updateUser(user, name);
	System.out.println("updatedUser " + updatedUser);
	 }
	 
	 
	 @PostMapping("/userDelete")
	 public void deleteUser(@RequestBody User user) {
	String msg = userService.deleteUser(user);
	System.out.println("Msg" + msg);
	 }
	
}
