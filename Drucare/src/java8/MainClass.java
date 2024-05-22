package java8;

public class MainClass implements MyInterface  {

	  public void callMethods() {
	        // Calling the default method
	        defaultMethod();

	        // Calling the static method
	        MyInterface.staticMethod();
	    }

	    public static void main(String[] args) {
	    	MainClass mainClass = new MainClass();
	    	mainClass.callMethods();
	    }

}
