package java8;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilters {

	 public List<String> search(List<String> list) {
	        return list.stream()
	                   .filter(s -> s.startsWith("a") && s.length() == 3)
	                   .collect(Collectors.toList());
	    }

	    public static void main(String[] args) {
	     
	        StringFilters filter = new StringFilters();
	        List<String> input = List.of("abc", "abcd", "aef", "ghij", "axy", "aaa", "azx");
	        List<String> result = filter.search(input);
	        System.out.println(result);
	        System.out.println("***************");
	        // allMatch, nonMatch, anyMatch
	        
	        StringFilters filter1 = new StringFilters();
	        List<String> input1 = List.of("abc", "abcd", "aef", "ghij", "axy", "aaa", "azx", "az");

	        List<String> result1 = filter1.search(input1);
	        System.out.println("Filtered list: " + result1); // Output: [abc, aef, axy, azx]
	        System.out.println("***************");
	        
	        // Check if all elements in the original list start with 'a'
	        boolean allMatch = input1.stream().allMatch(s -> s.startsWith("a"));
	        System.out.println("All elements start with 'a': " + allMatch); // Output: false
	        System.out.println("***************");
	        
	        // Check if any element in the original list starts with 'a'
	        boolean anyMatch = input1.stream().anyMatch(s -> s.startsWith("a"));
	        System.out.println("Any element starts with 'a': " + anyMatch); // Output: true
	        System.out.println("***************");
	        
	        // Check if no element in the original list starts with 'a'
	        boolean noneMatch = input1.stream().noneMatch(s -> s.startsWith("a"));
	        System.out.println("No element starts with 'a': " + noneMatch);
	    }}

