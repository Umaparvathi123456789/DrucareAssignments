package task;


	abstract class AbstractClass {
	    AbstractClass() {
	        System.out.println("This is constructor of abstract class");
	    }

	    abstract void a_method();

	    void normalMethod() {
	        System.out.println("This is a normal method of abstract class");
	    }
	}

	class SubClass extends AbstractClass {
	    @Override
	    void a_method() {
	        System.out.println("This is abstract method");
	    }
	}
	public class Abstract {
	    public static void main(String[] args) {
	        SubClass obj = new SubClass();
	        obj.a_method(); // Call abstract method
	        obj.normalMethod(); // Call non-abstract method
	    }
}
