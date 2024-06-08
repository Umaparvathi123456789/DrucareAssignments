package threads;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();
		
		Demo1 demo = new Demo1();// instantiated a thread
		demo.start(); //starting a thread 
		demo.join();
		for(int i = 0;i<5;i++) {
			System.out.println("main thread"+Thread.currentThread().getPriority());
		}
	}}


