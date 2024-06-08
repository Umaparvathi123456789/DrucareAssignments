package threads;

public class ThreadB {

	public static void main(String[] args) throws InterruptedException {

		ThreadACommunicate a = new ThreadACommunicate();
		a.start();
		synchronized (a) {
			System.out.println(" main gonna call wait method");
			a.wait();
			System.out.println("main got notification call ");
			System.out.println(a.total);
		}

		System.out.println("done");
	}
	}


