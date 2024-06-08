package task;


	abstract class Marks {
	    abstract double getPercentage();
	}

	class A extends Marks {
	    private int subject1, subject2, subject3;

	    // Constructor for student A
	    public A(int subject1, int subject2, int subject3) {
	        this.subject1 = subject1;
	        this.subject2 = subject2;
	        this.subject3 = subject3;
	    }

	    @Override
	    double getPercentage() {
	        // Calculate percentage for student A
	        return (subject1 + subject2 + subject3) / 3.0;
	    }
	}

	class B extends Marks {
	    private int subject1, subject2, subject3, subject4;

	    // Constructor for student B
	    public B(int subject1, int subject2, int subject3, int subject4) {
	        this.subject1 = subject1;
	        this.subject2 = subject2;
	        this.subject3 = subject3;
	        this.subject4 = subject4;
	    }

	    @Override
	    double getPercentage() {
	        // Calculate percentage for student B
	        return (subject1 + subject2 + subject3 + subject4) / 4.0;
	    }
	}

	public class MarksMain {
	    public static void main(String[] args) {
	        // Create object for student A with marks in three subjects
	        A studentA = new A(80, 85, 90);
	        
	        // Create object for student B with marks in four subjects
	        B studentB = new B(75, 80, 85, 90);

	        // Print percentage of marks for both students
	        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
	        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
	    }
}
