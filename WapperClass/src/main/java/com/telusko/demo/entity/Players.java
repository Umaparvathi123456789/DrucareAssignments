package com.telusko.demo.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Players {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		private String name;
		private String sport;
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
		public String getSport() {
			return sport;
		}
		public void setSport(String sport) {
			this.sport = sport;
		}
		public Players(Long id, String name, String sport) {
			super();
			this.id = id;
			this.name = name;
			this.sport = sport;
		}
		@Override
		public String toString() {
			return "Players [id=" + id + ", name=" + name + ", sport=" + sport + "]";
		}
		public Players() {
			super();
		}
		
		
}
