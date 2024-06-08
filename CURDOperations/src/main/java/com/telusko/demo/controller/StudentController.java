package com.telusko.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.demo.entity.Student;
import com.telusko.demo.service.StuService;

@RestController
@RequestMapping("/stu")
public class StudentController {
	
	@Autowired
	StuService stuservice;
	
@GetMapping("/get/all")
public List<Student>getAll(){
	return stuservice.getAll();
}

@PostMapping("/add")
public String getAll(@RequestBody Student stu) {
return stuservice.add(stu);
}

}
