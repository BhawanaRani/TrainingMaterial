package com.training.exilant.RestFul_Works_SPringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.training.restFull.users")
@SpringBootApplication
public class RestFulWorksSPringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulWorksSPringBootApplication.class, args);
	}
}
