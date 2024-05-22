package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class BiConsumerOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Person1> people = Arrays.asList(
	                new Person1("Alice", 50000, Arrays.asList("reading", "swimming")),
	                new Person1("Bob", 60000, Arrays.asList("gaming", "cycling")),
	                new Person1("Charlie", 55000, Arrays.asList("cooking", "hiking"))
	        );

	        // BiConsumer to get salary and hobbies in uppercase
	        BiConsumer<Double, List<String>> salaryAndHobbiesConsumer = (salary, hobbies) -> {
	            List<String> upperCaseHobbies = hobbies.stream()
	                                                    .map(String::toUpperCase)
	                                                    .collect(Collectors.toList());
	            System.out.println("Salary: " + salary + ", Hobbies: " + upperCaseHobbies);
	        };

	        // BiConsumer to get name and salary
	        BiConsumer<String, Double> nameAndSalaryConsumer = (name, salary) -> {
	            System.out.println("Name: " + name + ", Salary: " + salary);
	        };

	        // Apply the BiConsumers to each person
	        people.forEach(person -> {
	            salaryAndHobbiesConsumer.accept(person.getSalary(), person.getHobbies());
	            nameAndSalaryConsumer.accept(person.getName(), person.getSalary());
	        });
	    }
	}


