package task;

	interface BasicAnimal {
	    void eat();
	    void sleep();
	}

	// Class representing a monkey
	class Monkey {
	    // Method for monkey to jump
	    void jump() {
	        System.out.println("Monkey is jumping");
	    }

	    // Method for monkey to bite
	    void bite() {
	        System.out.println("Monkey is biting");
	    }
	}

	// Class representing a human, inheriting from Monkey and implementing BasicAnimal interface
	class Human extends Monkey implements BasicAnimal {
	    // Implementation of eat method from BasicAnimal interface
	    @Override
	    public void eat() {
	        System.out.println("Human is eating");
	    }

	    // Implementation of sleep method from BasicAnimal interface
	    @Override
	    public void sleep() {
	        System.out.println("Human is sleeping");
	    }
	}

	// Main class to test the functionalities
	public class MainClass { {
	    public static void main(String[] args) {
	        // Create an object of Human
	        Human human = new Human();

	        // Call methods specific to Human
	        human.eat();
	        human.sleep();

	        // Call methods inherited from Monkey
	        human.jump();
	        human.bite();
	    }
}
