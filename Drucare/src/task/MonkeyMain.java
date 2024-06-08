package task;
//Base class representing a Monkey
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

//Subclass representing a Spider Monkey
class SpiderMonkey extends Monkey {
 // Override jump method for SpiderMonkey
 @Override
 void jump() {
     System.out.println("Spider Monkey is swinging from tree to tree");
 }

 // Override bite method for SpiderMonkey
 @Override
 void bite() {
     System.out.println("Spider Monkey is biting fruits");
 }
}

//Main class to demonstrate polymorphism
public class Main {
 public static void main(String[] args) {
     // Create a Monkey object and reference it with Monkey type
     Monkey monkey = new Monkey();

     // Demonstrate polymorphism by calling methods
     monkey.jump(); // Calls jump method of Monkey class
     monkey.bite(); // Calls bite method of Monkey class

     // Create a SpiderMonkey object and reference it with Monkey type
     monkey = new SpiderMonkey();

     // Demonstrate polymorphism by calling methods
     monkey.jump(); // Calls jump method of SpiderMonkey class (overridden)
     monkey.bite(); // Calls bite method of SpiderMonkey class (overridden)
 }
}

