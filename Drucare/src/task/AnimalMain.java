package task;

	abstract class Animals {
	    abstract void cats();
	    abstract void dogs();
	}

	class Cats extends Animals {
	    @Override
	    void cats() {
	        System.out.println("Cats meow");
	    }

	    @Override
	    void dogs() {
	        // Empty method implementation for dogs in Cats class
	    }
	}

	class Dogs extends Animals {
	    @Override
	    void cats() {
	        // Empty method implementation for cats in Dogs class
	    }

	    @Override
	    void dogs() {
	        System.out.println("Dogs bark");
	    }
	}
	public class AnimalMain {
	    public static void main(String[] args) {
	        Cats cat = new Cats();
	        Dogs dog = new Dogs();

	        cat.cats(); // Call method specific to Cats
	        dog.dogs(); // Call method specific to Dogs
	    }
}
