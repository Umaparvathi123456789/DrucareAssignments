package task;

public class MyInterface {
	 default void defaultMethod() {
	        System.out.println("This is the default method of MyInterface.");
	    }
	}

	// Class implementing the interface with default method
	public class MyClass implements MyInterface {
	    public static void main(String[] args) {
	        MyClass obj = new MyClass();
	        obj.defaultMethod(); // Calling the default method from the interface
	    }
	}

	// Interface with default and static methods
	interface MyInterfaceWithStatic {
	    default void defaultMethod() {
	        System.out.println("This is the default method of MyInterfaceWithStatic.");
	    }
	    
	    static void staticMethod() {
	        System.out.println("This is the static method of MyInterfaceWithStatic.");
	    }
	}

	// Class implementing the interface with default and static methods
	public class MyClassWithStatic implements MyInterfaceWithStatic {
	    public static void main(String[] args) {
	        MyClassWithStatic obj = new MyClassWithStatic();
	        obj.defaultMethod(); // Calling the default method from the interface
	        
	        // Calling the static method from the interface
	        MyInterfaceWithStatic.staticMethod();
	    }
	

}
