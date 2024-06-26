package com.telusko.secure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchangeRate {
@Id
@GeneratedValue
private int id;
	@Column(name="exchange_from")
private String from;
	@Column(name="exchange_to")
private String to;
private Long exchangeRate;
private int port;
public int getId() {
	return id;
}
public  void setId(int id) {
	this.id = id;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public Long getExchangeRate() {
	return exchangeRate;
}
public void setExchangeRate(Long exchangeRate) {
	this.exchangeRate = exchangeRate;
}
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public CurrencyExchangeRate(int id, String from, String to, Long exchangeRate) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.exchangeRate = exchangeRate;

}
public CurrencyExchangeRate() {
}
}
