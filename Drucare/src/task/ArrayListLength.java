package task;

import java.util.ArrayList;

public class ArrayListLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> foodList = new ArrayList<>();
	        foodList.add("Pizza");
	        foodList.add("Burger");
	        foodList.add("Pasta");
	        int length = foodList.size();
	        System.out.println("Length of ArrayList: " + length);
	}

}
