package task;

import java.util.ArrayList;

public class TraverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> foodList = new ArrayList<>();
	        foodList.add("Pizza");
	        foodList.add("Burger");
	        foodList.add("Pasta");
	        System.out.println("Traversing Food List:");
	        for (String food : foodList) {
	            System.out.println(food);
	        }
	}

}
