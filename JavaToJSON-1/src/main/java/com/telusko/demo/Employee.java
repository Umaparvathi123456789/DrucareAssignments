package com.telusko.demo;

public class Employee {
	private int id;
	private String name;
	private String role;	
	private String dateOfJoining;
	private int age;
	private String location;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDateOfJoining() {
		return getDateOfJoining();
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", dateOfJoining=" + dateOfJoining
				+ ", age=" + age + ", location=" + location + "]";
	}
	public Employee(int id, String name, String role, String dateOfJoining, int age, String location) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.location = location;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
