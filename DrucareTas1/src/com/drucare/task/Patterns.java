package com.drucare.task2;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
System.out.println("rigth triangle :");
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
			System.out.print("*");
	}
	System.out.println();
}
System.out.println();
System.out.println("right downward triangle :");
for(int i=1;i<=n;i++) {
	for(int j=i;j<=n;j++) {
			System.out.print("*");
	}
	System.out.println();
}
System.out.println();
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
System.out.println("right alphabetical triangle :");
int alphabet = 65; // ASCII value of 'A'

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
