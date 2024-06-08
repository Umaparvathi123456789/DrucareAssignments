package task;

import java.util.ArrayList;

public class CheckElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<String> foodList = new ArrayList<>();
        foodList.add("Pizza");
        foodList.add("Burger");
        foodList.add("Pasta");
        boolean exists = foodList.contains("Pizza");
        System.out.println("Does Pizza exist in the list? " + exists);
	}

}
