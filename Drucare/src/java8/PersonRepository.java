package java8;

import java.util.Arrays;
import java.util.List;

public class PersonRepository implements PersonRepositorys {
	  @Override
	    public List<Person> findAll() {
	        return Arrays.asList(
	            new Person("Alice", "Female", 12000,120),
	            new Person("Bob", "Male",13000,115),
	            new Person("Charlie", "Male",23000, 105),
	            new Person("Diana", "Female",24000,130)
	        );
	    }
}
