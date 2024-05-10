package task;

public class StudentClass {
	 String name;

	    // Constructor with default value "Unknown"
	    public StudentClass() {
	        this.name = "Unknown";
	    }

	    // Constructor with parameterized value
	    public StudentClass(String name) {
	        this.name = name;
	    }

	    // Method to get student name
	    public String getName() {
	        return name;
	    }
	}

	class MainClass {
	    public static void main(String[] args) {
	        // Creating Student objects with different names
	    	StudentClass student1 = new StudentClass();
	    	StudentClass student2 = new StudentClass("Alice");
	    	StudentClass student3 = new StudentClass("Bob");
	    	
	        // Printing names of students
	        System.out.println("Name of student 1: " + student1.getName());
	        System.out.println("Name of student 2: " + student2.getName());
	        System.out.println("Name of student 3: " + student3.getName());
	    }
}
