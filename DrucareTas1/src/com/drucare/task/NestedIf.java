package com.drucare.task2;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name=new Scanner(System.in);
		System.out.println("enter the money: ");
		int myMoney=name.nextInt();
		
	        if(myMoney >= 50) {
	                System.out.println("You can afford an iPhone");
	        } else if(myMoney >= 25) {
	                System.out.println("You can afford a Redmi phone");
	        } else if(myMoney >= 10) {
	                System.out.println("You can afford a normal Nokia set");
	        } else {
	                 System.out.println("Return home");
	        }
	        name.close();
		}
	}