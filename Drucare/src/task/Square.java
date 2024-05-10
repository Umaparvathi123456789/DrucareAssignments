package task;

public class Square extends Rectangle{
	public Square(double length, double breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	void printSquare() 
	{
		super.meth1();
		System.out.println("Square is a rectangle");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square=new Square(breadth, breadth);
		square.printSquare();
		square.printRectangle();
	}

	private void printRectangle() {
		// TODO Auto-generated method stub
		
	}
}
