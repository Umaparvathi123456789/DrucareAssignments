package com.telusko.demo.repositary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.telusko.demo.entity.Student;

@Repository
public class StudentRepo {
	
 public List<Student> stu=new ArrayList<Student>();
 
 public List<Student> getAll(){
	 return stu;
 }


public String add(Student student) {
	stu.add(student);
	return "sucessfully added";


}
}
