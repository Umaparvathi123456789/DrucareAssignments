package task;

abstract class Telephone {
    // Abstract method to make a call
    abstract void call();

    // Abstract method to lift the receiver
    abstract void lift();

    // Abstract method to handle when the call is disconnected
    abstract void disconnected();
}

// Concrete subclass representing a SmartTelephone
class SmartTelephone extends Telephone {
    // Implementation of the call method for SmartTelephone
    @Override
    void call() {
        System.out.println("Making a call from SmartTelephone");
    }

    // Implementation of the lift method for SmartTelephone
    @Override
    void lift() {
        System.out.println("Lifting the receiver of SmartTelephone");
    }

    // Implementation of the disconnected method for SmartTelephone
    @Override
    void disconnected() {
        System.out.println("Call disconnected on SmartTelephone");
    }
}

// Main class to demonstrate polymorphism
public class TelephoneMain {
    public static void main(String[] args) {
        // Create an instance of SmartTelephone
        Telephone phone = new SmartTelephone();

        // Demonstrate polymorphism by calling methods
        phone.call();
        phone.lift();
        phone.disconnected();
    }
    }