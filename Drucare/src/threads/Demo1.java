package threads;

public class Demo1 extends Thread{
	@Override
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("child thread"+Thread.currentThread().getPriority());
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("interrupted");
		}
		
		}

	}}