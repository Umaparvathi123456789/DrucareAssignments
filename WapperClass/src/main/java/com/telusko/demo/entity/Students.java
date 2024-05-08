package com.telusko.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Students {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String course;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	public Students(Long id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public Students() {
		super();
	}
	
	
}
