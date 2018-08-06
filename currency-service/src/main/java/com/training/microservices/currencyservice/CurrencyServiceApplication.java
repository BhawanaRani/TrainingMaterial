package com.training.microservices.currencyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class CurrencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyServiceApplication.class, args);
	}
}
