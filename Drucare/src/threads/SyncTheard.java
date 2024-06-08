package threads;

public class SyncTheard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		Demo d2 = new Demo();
		

	DemoThread t1 = new DemoThread(d,"morning");
	DemoThread t2 =new DemoThread(d2,"afternoon");
		t1.start();
		t2.start();
	}

}
