package com.drucare.task2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);

        System.out.println("Enter your grade A,B,C,D or F:");
        char grade = obj.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent! Your grade is A");
                System.out.println("Scored above 90%");
                break;
            case 'B':
                System.out.println("Distinction! Your grade is B");
                System.out.println("Scored between 75% to 89%");
                break;
            case 'C':
                System.out.println("First class! Your grade is C");
                System.out.println("Scored between 65% to 74%");
                break;
            case 'D':
                System.out.println("Second class! Your grade is D.");
                System.out.println("Scored between 50% to 64%");
                break;
            case 'F':
                System.out.println("Failed! Your grade is F.");
                System.out.println("You have scored below 50%");
                break;
            default:
                System.out.println("Invalid grade! Please enter A, B, C, D, or F.");
        }

        obj.close();
	}

}
