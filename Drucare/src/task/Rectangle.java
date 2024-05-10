package task;

public class Rectangle {
	 double length;
	    static double breadth;

	    // Constructor to initialize length and breadth
	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    // Method to calculate the area of the rectangle
	    public double calculateArea() {
	        return length * breadth;
	    }

	    public static void main(String[] args) {
	        // Creating two rectangles with given dimensions
	        Rectangle rectangle1 = new Rectangle(4, 5);
	        Rectangle rectangle2 = new Rectangle(5, 8);

	        // Calculating areas
	        double area1 = rectangle1.calculateArea();
	        double area2 = rectangle2.calculateArea();

	        // Displaying results
	        System.out.println("Area of rectangle 1: " + area1);
	        System.out.println("Area of rectangle 2: " + area2);
	    }

		public void meth1() {
			// TODO Auto-generated method stub
			
		}
}
