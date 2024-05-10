package task;

public class Members {
	  String name;
	    int age;
	    String phoneNumber;
	    String address;
	    double salary;

	    public void printSalary() {
	        System.out.println("Salary: " + salary);
	    }
	}

	class Employee extends Members {
	    String specialization;
	    
	    // Constructor
	    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	        this.specialization = specialization;
	    }
	}

	class Manager extends Members {
	    String department;
	    
	    // Constructor
	    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	        this.department = department;
	    }
		    public static void main(String[] args) {
	        // Creating an Employee object
	        Employee emp = new Employee("John Doe", 30, "1234567890", "123 Main St, City", 50000.0, "Software Development");
	        
	        // Creating a Manager object
	        Manager manager = new Manager("Jane Smith", 35, "0987654321", "456 Park Ave, Town", 80000.0, "Operations");
	        
	        // Printing employee details
	        System.out.println("Employee Details:");
	        System.out.println("Name: " + emp.name);
	        System.out.println("Age: " + emp.age);
	        System.out.println("Phone Number: " + emp.phoneNumber);
	        System.out.println("Address: " + emp.address);
	        emp.printSalary(); // calling printSalary method
	        
	        // Printing manager details
	        System.out.println("\nManager Details:");
	        System.out.println("Name: " + manager.name);
	        System.out.println("Age: " + manager.age);
	        System.out.println("Phone Number: " + manager.phoneNumber);
	        System.out.println("Address: " + manager.address);
	        manager.printSalary(); // calling printSalary method
	    }
}
