package task;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstNameCaps  = "ALEX";
        String s=firstNameCaps.substring(0, 1).toUpperCase() + firstNameCaps.substring(1).toLowerCase();
        System.out.println(s);
	
	}

}
