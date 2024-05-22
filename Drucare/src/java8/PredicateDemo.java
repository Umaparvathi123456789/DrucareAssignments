package java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Predicate<String> isLengthGreaterThan3 = s -> s.length() > 3;
	      
	        System.out.println(isLengthGreaterThan3.test("Hello")); // true
	        System.out.println(isLengthGreaterThan3.test("Hi"));    // false
	        
	        // Using and method to combine two predicates
	        Predicate<String> containsA = s -> s.contains("a");
	        Predicate<String> startsWithH = s -> s.startsWith("H");
	  
	        Predicate<String> containsAAndStartsWithH = containsA.and(startsWithH);
	        System.out.println(containsAAndStartsWithH.test("Happy"));  
	        System.out.println(containsAAndStartsWithH.test("Hat"));   
	        
	        Predicate<String> containsAOrStartsWithH = containsA.or(startsWithH);
	        System.out.println(containsAOrStartsWithH.test("Happy")); 
	        System.out.println(containsAOrStartsWithH.test("Hat"));   
	        System.out.println(containsAOrStartsWithH.test("Hello"));  
	        System.out.println(containsAOrStartsWithH.test("Test"));  
	    
	}

}
