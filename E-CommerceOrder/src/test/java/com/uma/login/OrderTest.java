package com.uma.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uma.login.entity.OderDemo;


public class OrderTest {

	OderDemo demo = new OderDemo();
	@Test
	void getDataLength() {
		int output = demo.dataCalculation("hello");
		assertEquals(5, output); //expectation , actual
		assertEquals(4, output);
//		String n=demo.dataCalculations(String  name);
//		assertEquals("uma parvathi", n);
	}
	
	
}
