package java8;

import java.util.List;

public class Person1 {
	   private String name;
	    private double salary;
	    private List<String> hobbies;

	    public Person1(String name, double salary, List<String> hobbies) {
	        this.name = name;
	        this.salary = salary;
	        this.hobbies = hobbies;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public List<String> getHobbies() {
	        return hobbies;
	    }

	    @Override
	    public String toString() {
	        return "Person1{name='" + name + "', salary=" + salary + ", hobbies=" + hobbies + "}";
	    }
}
