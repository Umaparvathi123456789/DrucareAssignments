package threads;

public class DemoThread extends Thread{
	Demo d;
	String name;
	DemoThread(Demo d , String name){
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.m1(name);
	}
}
