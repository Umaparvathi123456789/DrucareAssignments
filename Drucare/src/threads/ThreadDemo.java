package threads;

public class ThreadDemo{
	public static void main(String[] args) {

		MyThread t = new MyThread();// instantiated a thread
		t.start(); //starting a thread 
		  t.setName("Child Thread");

		for(int i = 0;i<5;i++) {
			System.out.println("main thread name: " + Thread.currentThread().getName());
					
		}
	}
}
