package java8;

import java.util.function.BiPredicate;

public class BiPreDicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BiPredicate<Integer, Integer> isEvenAndGreaterThan10 = (a, b) -> a % 2 == 0 && b > 10;

	        // Test the BiPredicate
	        System.out.println(isEvenAndGreaterThan10.test(12, 15)); 
	        System.out.println(isEvenAndGreaterThan10.test(7, 15));  
	        System.out.println(isEvenAndGreaterThan10.test(12, 5));  
	        System.out.println(isEvenAndGreaterThan10.test(7, 5));   
	    
	}

}
