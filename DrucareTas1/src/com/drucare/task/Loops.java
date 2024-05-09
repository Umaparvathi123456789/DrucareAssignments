package com.drucare.task2;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		int num1;	
// While Loop
		System.out.println("1.while loop condition :");
		while(num<10) {
			num1=num+4;
			System.out.println(num1);
			num++;
		}
//For Loop
		System.out.println();
		System.out.println("2.for loop condition :");
		for(int i=1;i<=num;i++) {
			System.out.print(" "+i);
		}
		System.out.println();
//Do While
		System.out.println();
		System.out.println("3.do while loop condition:");
		do {
			System.out.println(num);
		}
		while(num<10) ;
	}}
