package task;

public class Avengers {

		String name="Uma";
		public Avengers() {
			super();
		}
	public Avengers(String name) {
			super();
			this.name = name;
		}

	public static void main(String[] args) {
		Avengers a=new Avengers();
		System.out.println(a.name);
		Avengers b=new Avengers("Parvathi");
        System.out.println(b);
	}

	

}
