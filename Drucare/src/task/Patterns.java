package task;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pyramid Pattern
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows for the pyramid:");
	        int rows = scanner.nextInt();

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        scanner.close();
//Right Triangle Pattern
	        System.out.println();
		int n=10;
		System.out.println("rigth triangle :");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//Right downward triangle Pattern
		System.out.println("right downward triangle :");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//Left Triangle  Pattern
		System.out.println("left triangle: ");
		for (int i = 1; i <= n; i++) {

		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i; k++) {
		        System.out.print("*");
		    }
		       System.out.println();
		}
		System.out.println();
// Right Alphabetical Triangle Pattern
		System.out.println("right alphabetical triangle :");
		int alphabet = 65;

		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i; k++) {
		        System.out.print((char) (alphabet + k - 1) + " ");
		    }
		    System.out.println();
		}
	}

}
