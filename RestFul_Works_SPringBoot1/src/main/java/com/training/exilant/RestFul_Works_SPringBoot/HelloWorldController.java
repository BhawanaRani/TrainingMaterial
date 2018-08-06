package com.training.exilant.RestFul_Works_SPringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	
	@GetMapping(path="hello")
	public String helloWorld()
	{
		return "hello g";
	}
	
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorld helloWorld2()
	{
		return new HelloWorld("Hello g........");
		
	}
	
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorld helloWorldPathVariable(@PathVariable String name)
	{
		return new HelloWorld("Hello g....."+name);
	}
	
	

}
