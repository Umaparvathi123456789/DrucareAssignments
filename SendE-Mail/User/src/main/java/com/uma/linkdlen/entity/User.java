package com.uma.linkdlen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
private String  jobTitles;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column
	private String LocationTypes;
	@Column
	private String LocationOnSite;
	@Column
	private String startDate;
	@Column
	private String employementType;
	@Column
	private String visibility;

	public String getJobTitles() {
		return jobTitles;
	}

	public void setJobTitles(String jobTitles) {
		this.jobTitles = jobTitles;
	}

	public String getLocationTypes() {
		return LocationTypes;
	}

	public void setLocationTypes(String locationTypes) {
		LocationTypes = locationTypes;
	}

	public String getLocationOnSite() {
		return LocationOnSite;
	}

	public void setLocationOnSite(String locationOnSite) {
		LocationOnSite = locationOnSite;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEmployementType() {
		return employementType;
	}

	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	
}
