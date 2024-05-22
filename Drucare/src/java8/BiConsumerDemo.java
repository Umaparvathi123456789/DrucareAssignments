package java8;

import java.util.function.BiConsumer;

public interface BiConsumerDemo {
    public static void main(String[] args) {

	   BiConsumer<Integer, Integer> biConsumer = (Integer x, Integer y) -> {
           int result = x + y;
           System.out.println("The sum of " + x + " and " + y + " is " + result);
       };
       biConsumer.accept(5, 10); 
       biConsumer.accept(20, 30); 
       
       BiConsumer<String, String> biConsumer1 = (String s1, String s2) -> {
           String combinedString = s1 + " " + s2;
           System.out.println("Combined string: " + combinedString);
       };
       biConsumer1.accept("Hello", "World"); 
       biConsumer1.accept("Java", "Programming"); 
       
     //BiConsumers using andThen
       BiConsumer<Integer, Integer> sumConsumer = (Integer x, Integer y) -> {
           int sum = x + y;
           System.out.println("Sum: " + sum);
       };

       BiConsumer<Integer, Integer> productConsumer = (Integer x, Integer y) -> {
           int product = x * y;
           System.out.println("Product: " + product);
       };
              BiConsumer<Integer, Integer> combinedConsumer = sumConsumer.andThen(productConsumer);

       // Call the combined BiConsumer with Integer inputs
       combinedConsumer.accept(5, 10);  
       combinedConsumer.accept(3, 7);  
}
}
