package com.uma.login;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceOrderApplication {
    private static final Logger LOGGER = Logger.getLogger(ECommerceOrderApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(ECommerceOrderApplication.class, args);
		
        LOGGER.log(Level.INFO, "Welcome to E-Commerce  Microservice");

	}
}
