package com.uma.drucare.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="paySlip_table")
public class PaySlip {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long paySlipId;
private LocalDate payDate;
private String basicPay;
private String netPay;

@ManyToOne()
public Employee employee;

public Long getPaySlipId() {
	return paySlipId;
}
public void setPaySlipId(Long paySlipId) {
	this.paySlipId = paySlipId;
}
public LocalDate getPayDate() {
	return payDate;
}
public void setPayDate(LocalDate payDate) {
	this.payDate = payDate;
}
public String getBasicPay() {
	return basicPay;
}
public void setBasicPay(String basicPay) {
	this.basicPay = basicPay;
}
public String getNetPay() {
	return netPay;
}
public void setNetPay(String netPay) {
	this.netPay = netPay;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public PaySlip(Long paySlipId, LocalDate payDate, String basicPay, String netPay,Long employeeId) {
	super();
	this.paySlipId = paySlipId;
	this.payDate = payDate;
	this.basicPay = basicPay;
	this.netPay = netPay;
	this.employee = new Employee(employeeId,"","","");
}
public PaySlip() {
	super();
}
@Override
public String toString() {
	return "PaySlip [paySlipId=" + paySlipId + ", payDate=" + payDate + ", basicPay=" + basicPay + ", netPay=" + netPay
			+ ", employee=" + employee + "]";
}

}
