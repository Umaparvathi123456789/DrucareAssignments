package task;

import java.util.Scanner;

public class Claculator {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user to enter marks
	        System.out.print("Enter your marks (out of 100): ");
	        int marks = scanner.nextInt();

	        // Display grade based on marks
	        displayGrade(marks);

	        scanner.close();
	    }

	    // Method to display grade based on marks
	    public static void displayGrade(int marks) {
	        char grade;

	        if (marks >= 91 && marks <= 100) {
	            grade = 'A';
	        } else if (marks >= 81 && marks <= 90) {
	            grade = 'B';
	        } else if (marks >= 71 && marks <= 80) {
	            grade = 'C';
	        } else if (marks >= 61 && marks <= 70) {
	            grade = 'D';
	        } else if (marks >= 51 && marks <= 60) {
	            grade = 'E';
	        } else if (marks >= 41 && marks <= 50) {
	            grade = 'F';
	        } else {
	            grade = 'G'; // Failed
	        }

	        // Display the grade
	        switch (grade) {
	            case 'A':
	                System.out.println("Grade: AA");
	                break;
	            case 'B':
	                System.out.println("Grade: AB");
	                break;
	            case 'C':
	                System.out.println("Grade: BB");
	                break;
	            case 'D':
	                System.out.println("Grade: BC");
	                break;
	            case 'E':
	                System.out.println("Grade: CD");
	                break;
	            case 'F':
	                System.out.println("Grade: DD");
	                break;
	            default:
	                System.out.println("Grade: Fail");
	        }
	    }
}
