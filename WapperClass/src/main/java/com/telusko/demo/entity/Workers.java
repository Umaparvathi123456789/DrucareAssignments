package com.telusko.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Workers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String duty;
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
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	@Override
	public String toString() {
		return "Workers [id=" + id + ", name=" + name + ", duty=" + duty + "]";
	}
	public Workers(Long id, String name, String duty) {
		super();
		this.id = id;
		this.name = name;
		this.duty = duty;
	}
	public Workers() {
		super();
	}
	
	
}
