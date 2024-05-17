package task;

import java.util.ArrayList;

public class AddElementAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> foodList = new ArrayList<>();
	        foodList.add("Pizza");
	        foodList.add("Burger");
	        foodList.add("Pasta");
	        foodList.add("Sandwich");
	        foodList.add(3, "Icecream");
	        
	        System.out.println("Food List after adding Icecream: " + foodList);
	}

}
