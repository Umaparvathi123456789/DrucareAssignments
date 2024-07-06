package com.uma.login.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiSwagger {
	@Bean
	public OpenAPI defineOpenApi() {
		Server server = new Server();
		server.setUrl("http://localhost:8888/uma");
		server.setDescription("for project purpose");
		
		Contact contact = new Contact();
		contact.setName("uma parvathi veerapaneni");
		contact.setEmail("dummyemail.com");
		
		Info information = new Info()
				.title("E-Comerce Project api")
				.version("3.0")
				.description("expose endpoints to of orders entity table")
				.contact(contact);
		
		return new OpenAPI().info(information).servers(List.of(server));
	}
}
