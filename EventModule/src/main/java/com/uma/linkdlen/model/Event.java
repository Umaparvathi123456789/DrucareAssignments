package com.uma.linkdlen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="event")
public class Event {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(name="eventType")
private String type;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
private String lastName;

@Column(name="startDate")
private String startDate;

@Column(name="endDate")
private String endDate;

@Column(name="startTime")
private String startTime;

@Column(name="endTime")
private String endTime;

@Column(name="description")
private String description;

public Event(Long id, String type, String firstName, String lastName, String startDate, String endDate,
		String startTime, String endTime, String description) {
	super();
	this.id = id;
	this.type = type;
	this.firstName = firstName;
	this.lastName = lastName;
	this.startDate = startDate;
	this.endDate = endDate;
	this.startTime = startTime;
	this.endTime = endTime;
	this.description = description;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getStartDate() {
	return startDate;
}

public void setStartDate(String startDate) {
	this.startDate = startDate;
}

public String getEndDate() {
	return endDate;
}

public void setEndDate(String endDate) {
	this.endDate = endDate;
}

public String getStartTime() {
	return startTime;
}

public void setStartTime(String startTime) {
	this.startTime = startTime;
}

public String getEndTime() {
	return endTime;
}

public void setEndTime(String endTime) {
	this.endTime = endTime;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "Event [id=" + id + ", type=" + type + ", firstName=" + firstName + ", lastName=" + lastName + ", startDate="
			+ startDate + ", endDate=" + endDate + ", startTime=" + startTime + ", EndTime=" + endTime
			+ ", description=" + description + "]";
}

public Event() {
	super();
	// TODO Auto-generated constructor stub
}


}


