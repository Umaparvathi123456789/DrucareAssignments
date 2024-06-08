package com.telusko.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.demo.entity.Student;
import com.telusko.demo.repositary.StudentRepo;
@Service
public class StuService {
	@Autowired
	StudentRepo studentrepo;

	public List<Student> getAll() {
		
		return studentrepo.getAll();
	}

	public String add(Student stu) {
		
		return studentrepo.add(stu);
	}
}
