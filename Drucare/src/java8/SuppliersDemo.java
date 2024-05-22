package java8;

import java.util.function.Supplier;

public interface SuppliersDemo {
    public static void main(String[] args) {

	  Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 100);

      // Get a random integer using the supplier
      int randomNumber = randomIntegerSupplier.get();
      System.out.println("Random number: " + randomNumber);

      // Supplier that supplies a constant value
      Supplier<String> constantSupplier = () -> "Hello, World!";

      // Get the constant value using the supplier
      String constantValue = constantSupplier.get();
      System.out.println("Constant value: " + constantValue);
}
}