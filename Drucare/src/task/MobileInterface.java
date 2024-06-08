package task;

public abstract class MobileInterface {
	public abstract void sendSms();
	public void msg();
	public default void checkBattery() {
		System.out.println("battery is low");
	}
	public static void printName() {
		System.out.println("welcome user");
	}

}
