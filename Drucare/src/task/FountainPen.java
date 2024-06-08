package task;

public class FountainPen extends Pen {
	 // Concrete implementation of the write method for FountainPen
    @Override
    void write() {
        System.out.println("Writing with Fountain Pen");
    }

    // Concrete implementation of the refill method for FountainPen
    @Override
    void refill() {
        System.out.println("Refilling Fountain Pen");
    }

    // Additional method specific to FountainPen to change the nib
    void changeNib() {
        System.out.println("Changing the nib of Fountain Pen");
    }
}
