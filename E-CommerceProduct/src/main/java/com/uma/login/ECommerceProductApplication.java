package com.uma.login;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceProductApplication {
    private static final Logger LOGGER = Logger.getLogger(ECommerceProductApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(ECommerceProductApplication.class, args);
		  LOGGER.log(Level.INFO, "Welcome to E-Commerce Product Misroservice");

	}

}
