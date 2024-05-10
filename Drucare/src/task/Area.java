package task;

public class Area {

	 public void calculateArea(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    
	    public void calculateArea(int side) {
	        int area = side * side;
	        System.out.println("Area of Square: " + area);
	    }

	    public static void main(String[] args) {
	        Area calculator = new Area();
	        calculator.calculateArea(5,9);
	        calculator.calculateArea(7);
	    }
}
