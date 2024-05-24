package java8;

public class Person {
	 private String name;
	    private String gender;
	    private double salary;
	    private int height;
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public Person(String name, String gender, double salary, int height) {
			super();
			this.name = name;
			this.gender = gender;
			this.salary = salary;
			this.height = height;
		}
		public Person() {
			super();
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + ", salary=" + salary + ", height=" + height + "]";
		}

}