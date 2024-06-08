package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.range(1, 7).skip(5).forEach(System.out::println);
		IntStream.range(1,7).skip(5).forEach(System.out::print);
		System.out.println();
		Map<String,Integer> obj=new HashMap<>();
		obj.put("uma",1);
		obj.put("parvathi",2);
		System.out.println(obj);
		
	}
	

}
