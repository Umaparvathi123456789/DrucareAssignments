package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PreDicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Person3> people = Arrays.asList(
	                new Person3("Alice", "female", 50000, Arrays.asList("reading", "swimming")),
	                new Person3("Bob", "male", 60000, Arrays.asList("gaming", "cycling")),
	                new Person3("Charlie", "male", 1500, Arrays.asList("cooking", "hiking")),
	                new Person3("Diana", "female", 1800, Arrays.asList("dancing", "singing"))
	        );
	        Predicate<Person3> isFemale = p -> p.getGender().equalsIgnoreCase("female");

	        Predicate<Person3> isSalaryGreaterThan2000 = p -> p.getSalary() > 2000;

	        Predicate<Person3> isFemaleAndSalaryGreaterThan2000 = isFemale.and(isSalaryGreaterThan2000);

	        // Testing the combined predicate
	        people.forEach(person -> {
	            if (isFemaleAndSalaryGreaterThan2000.test(person)) {
	                System.out.println(person);
	            }
	        });
	}

}
