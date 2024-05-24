package java8;

import java.util.List;
import java.util.stream.Collectors;

public class PersonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PersonRepository personRepository = new PersonRepository();
	        List<Person> persons = personRepository.findAll();

	        // 1. Print the names of all persons
	        System.out.println("Names of all persons:");
	        persons.stream()
	               .map(Person::getName)
	               .forEach(System.out::println);

	        // 2. Print the gender of all persons
	        System.out.println("\nGender of all persons:");
	        persons.stream()
	               .map(Person::getGender)
	               .forEach(System.out::println);

	        // 3. Get the names of persons whose height is greater than 110
	        System.out.println("\nNames of persons whose height is greater than 110:");
	        List<String> tallPersons = persons.stream()
	                                          .filter(person -> person.getHeight() > 110)
	                                          .map(Person::getName)
	                                          .collect(Collectors.toList());

	        System.out.println(tallPersons);
	    
	}

}
