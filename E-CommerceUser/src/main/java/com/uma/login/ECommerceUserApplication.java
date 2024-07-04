package com.uma.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ECommerceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceUserApplication.class, args);
	}
	//Created a bean for and rest template and also done connecting with eureka server
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
