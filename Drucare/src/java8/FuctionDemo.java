package java8;

import java.util.function.Function;

public interface FuctionDemo {
    public static void main(String[] args) {
        Function<String, String> toUpperCaseFunction = str -> str.toUpperCase();

        String result = toUpperCaseFunction.apply("hello");
        System.out.println("Uppercase result: " + result);

        Function<Integer, Integer> squareFunction = x -> x * x;
        System.out.println(squareFunction);
        // Apply the function
        int squareResult = squareFunction.apply(5);
        System.out.println("Square result: " + squareResult);
        
        // Apply the combined function
        Function<String, String> toUpperCaseFunctionDemo = str -> str.toUpperCase();

        Function<String, String> addWorldFunction = str -> str + " WORLD";

        Function<String, String> combinedFunction = toUpperCaseFunctionDemo.andThen(addWorldFunction);
       
        String result1 = combinedFunction.apply("hello");
        System.out.println("Combined result: " + result1);
}
}