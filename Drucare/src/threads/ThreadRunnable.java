package threads;

public class ThreadRunnable {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			MyRunnable run = new MyRunnable();// instantiated a thread
			Thread t = new Thread(run);
			t.start(); //starting a thread
			Thread.currentThread().setPriority(10);
			for(int i = 0;i<5;i++) {
				System.out.println("main " +Thread.currentThread().getName());
			}
			
		}
	}
