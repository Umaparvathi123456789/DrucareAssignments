package task;
abstract class ParentsClass {
    abstract void message();
}

class FirstSubclass extends ParentsClass {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends ParentsClass {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

public class ParentMain {
    public static void main(String[] args) {
        FirstSubclass firstObj = new FirstSubclass();
        SecondSubclass secondObj = new SecondSubclass();

        firstObj.message();
        secondObj.message();
    }
}
