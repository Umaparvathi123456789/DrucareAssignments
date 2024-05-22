package java8;

import java.util.function.Consumer;

public class ConsumerDemo {
	  public static void main(String[] args) {
	        // Define a Consumer that performs an operation on an Integer
	        Consumer<Integer> consumer = (Integer x) -> {
	            int result = x * x;
	            System.out.println("The square of " + x + " is " + result);
	        };
	        consumer.accept(10);
	    
	  Consumer<String> consumer1 = (String s) -> {
          String upperCaseString = s.toUpperCase();
          System.out.println("Uppercase: " + upperCaseString);
      };
      consumer1.accept("hello");  
      
      Consumer<String> upperCaseConsumer = (String s) -> {
          String upperCaseString = s.toUpperCase();
          System.out.println("Uppercase: " + upperCaseString);
      };
      Consumer<String> lengthConsumer = (String s) -> {
          int length = s.length();
          System.out.println("Length: " + length);
      };

      // Consumers using andThen
      Consumer<String> combinedConsumer = upperCaseConsumer.andThen(lengthConsumer);

      combinedConsumer.accept("hello");  
      combinedConsumer.accept("world"); 
  }
  }

