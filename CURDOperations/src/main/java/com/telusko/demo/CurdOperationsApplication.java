package com.telusko.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telusko.demo.entity.Student;
import com.telusko.demo.repositary.StudentRepo;

@SpringBootApplication
public class CurdOperationsApplication implements CommandLineRunner{
	 @Autowired
	 StudentRepo studentrepo;
	 

	public static void main(String[] args) {
		SpringApplication.run(CurdOperationsApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
	Student s1=new Student(101,"Hari","CSE");
	Student s2=new Student(102,"Uma","ECE");
	Student s3=new Student(103,"Mahi","MME");
	
	studentrepo.stu.addAll(Arrays.asList(s1,s2,s3));
	
		System
	}
}
