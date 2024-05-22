package java8;

public interface MyInterface  {
	 // Default method
    default void defaultMethod() {
        System.out.println("This is the default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is the static method.");
    }
}
