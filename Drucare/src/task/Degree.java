package task;

public class Degree {
	  public void getDegree() {
	        System.out.println("I got a degree");
	    }
	}

	class Undergraduate extends Degree {
	    @Override
	    public void getDegree() {
	        System.out.println("I am an Undergraduate");
	    }
	}

	class Postgraduate extends Degree {
	    @Override
	    public void getDegree() {
	        System.out.println("I am a Postgraduate");
	    }
	}

	 class Main {
	    public static void main(String[] args) {
	        Degree degree = new Degree();
	        Undergraduate undergraduate = new Undergraduate();
	        Postgraduate postgraduate = new Postgraduate();

	        // Calling the method using objects of each class
	        degree.getDegree();
	        undergraduate.getDegree();
	        postgraduate.getDegree();
	    }
}
