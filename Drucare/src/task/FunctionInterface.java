package task;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> func = n -> n.length();
		func.apply("hellow");
		Function<String,String> function = n -> n.toUpperCase();
		System.out.print(function.apply("team"));
	}

}
