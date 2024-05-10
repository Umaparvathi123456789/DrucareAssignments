package task;

import java.util.Scanner;

public class Complex {
		 double real;
		 double imaginary;

// Constructor 
		    public Complex(double real, double imaginary) {
		        this.real = real;
		        this.imaginary = imaginary;
		    }

// Method to add two complex numbers
		    public Complex add(Complex other) {
		        double sumReal = this.real + other.real;
		        double sumImaginary = this.imaginary + other.imaginary;
		        return new Complex(sumReal, sumImaginary);
		    }

// Method to subtract two complex numbers
		    public Complex subtract(Complex other) {
		        double real = this.real - other.real;
		        double imaginary = this.imaginary - other.imaginary;
		        return new Complex(real, imaginary);
		    }

// Method to multiply two complex numbers
		    public Complex multiply(Complex other) {
		        double real = (this.real * other.real) - (this.imaginary * other.imaginary);
		        double imaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
		        return new Complex(real, imaginary);
		    }

		    public static void main(String[] args) {
		        Scanner obj = new Scanner(System.in);

		        System.out.println("Enter the real part of the first complex number:");
		        double real1 = obj.nextDouble();

		        System.out.println("Enter the imaginary part of the first complex number:");
		        double imaginary1 = obj.nextDouble();

		        System.out.println("Enter the real part of the second complex number:");
		        double real2 = obj.nextDouble();

		        System.out.println("Enter the imaginary part of the second complex number:");
		        double imaginary2 = obj.nextDouble();

		        Complex complex1 = new Complex(real1, imaginary1);
		        Complex complex2 = new Complex(real2, imaginary2);

		        Complex result = complex1.add(complex2);
		        Complex differenceResult = complex1.subtract(complex2);
		        Complex productResult = complex1.multiply(complex2);

		        System.out.println("Sum: " +result.real + " + " + result.imaginary + "i");
		        System.out.println("Difference: " + differenceResult.real + " + " + differenceResult.imaginary + "i");
		        System.out.println("Product: " + productResult.real + " + " + productResult.imaginary + "i");

		        obj.close();
	}

}
