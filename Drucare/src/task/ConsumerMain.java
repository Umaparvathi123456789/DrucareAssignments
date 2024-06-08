package task;

import java.util.function.Consumer;

public class ConsumerMain {
	public static void main(String[] args) {
		Consumer<Integer> integerConsumer= (a) ->{
			System.out.println("Square of a is : "+ (a*a));
	
			if( a%2==0) {
				System.out.println(a +"is even");
			}
			else 
			{
				System.out.println(a +" is odd");
			}
	    };
	    integerConsumer.accept(5);
	    
	System.out.println("------------------------------------------");
	    
	Consumer<String> stringConsumer=(str) ->{
		System.out.println(str);
		System.out.println("Length of the string : "+str.length());
		};
        stringConsumer.accept("Java is Awesome");
	
        System.out.println("------------------------------------------");
        
	Consumer<Integer> integerConsumer2=(b)->{
		System.out.println("cube of b is :  "+(b*b*b));
		};

	integerConsumer.andThen(integerConsumer2).accept(5);
	
	System.out.println("------------------------------------------");
	
	Consumer<String> stringConsumer2=(str2)->{
		System.out.println(str2);
	};
	stringConsumer.andThen(stringConsumer2).accept("Anusha");
	}
}
