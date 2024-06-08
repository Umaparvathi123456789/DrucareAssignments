package task;

import java.util.ArrayList;

public class RemoveElementAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> foodList = new ArrayList<>();
	        foodList.add("Pizza");
	        foodList.add("Burger");
	        foodList.add("Pasta");
	        foodList.add("Sandwich");
	        foodList.remove(2);
	        
	        System.out.println("Food List after removing element at index 2: " + foodList);
	    
	}

}
