package com.telusko.demo;

@SpringBootApplication
public class JavaToJson1Application {

	public static void main(String[] args) {
		 Employee employe=new Employee() ;
		 employe.setId(101);
		 employe.setName("uma");
		 employe.setRole("java developer");
	     employe.setAge(22);
		 employe.setLocation("hyderbad");
		 employe.setDateOfJoining("02-10-2023");
		 
		 ObjectMapper mapper=new ObjectMapper();
	

	}

}
