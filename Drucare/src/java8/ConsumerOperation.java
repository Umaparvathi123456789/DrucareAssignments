package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerOperation {

	public static void main(String[] args) {
		  List<Person> people = Arrays.asList(
	                new Person("Alice", "female", 50000),
	                new Person("Bob", "male", 60000),
	                new Person("Charlie", "male", 55000)
	        );
	        Consumer<Person> genderUpperCaseConsumer = (p) -> {
	            p.setGender(p.getGender().toUpperCase());
	        };
	        Consumer<Person> bonusConsumer = (p) -> {
	            p.setSalary(p.getSalary() + 1000);
	        };
	        Consumer<Person> combinedConsumer = genderUpperCaseConsumer.andThen(bonusConsumer);

	        people.forEach(combinedConsumer);
	        people.forEach(System.out::println);
	    }
	}


