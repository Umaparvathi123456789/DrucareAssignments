package java8;

import java.util.List;

public class Person3 {
	 private String name;
	    private String gender;
	    private double salary;
	    private List<String> hobbies;

	    public Person3(String name, String gender, double salary, List<String> hobbies) {
	        this.name = name;
	        this.gender = gender;
	        this.salary = salary;
	        this.hobbies = hobbies;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public List<String> getHobbies() {
	        return hobbies;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', gender='" + gender + "', salary=" + salary + ", hobbies=" + hobbies + "}";
	    }
}
