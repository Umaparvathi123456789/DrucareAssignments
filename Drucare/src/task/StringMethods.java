package task;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.The following code should replace lol in the message with laugh out loud and print the new message.
		 String message = "That was great - lol.";
		 String newMessage=message.replaceAll("lol","laugh out loud");
		 System.out.println(newMessage);
		 
//2.The following code starts with String firstNameCaps = ALEX; and should print Alex. Use the toLowerCase and substring methods to do accomplish this task.
		  String firstNameCaps  = "ALEX";
		  String firstName = firstNameCaps.substring(0, 1).toUpperCase() + firstNameCaps.substring(1).toLowerCase();
		  System.out.println(firstName);
		  
//3.Finish the code below to print your favorite movie and book.
		    String movie = "RRR";
		    String book = "The Secret";
		    System.out.println("Favorite movie: "+movie+", Favorite book :"+book);
		   
//4.Finish the code below to print your favorite animal and food.
		    String animal ="Rabbit";
		    String food ="Mango Rice";
		    System.out.println("Favorite animal: "+animal+", Favorite food :"+food);
//5.Write the code to print “Julian’s favorite color is green. His favorite food is pizza.
		 String color = "green";
		 String name="Julian";
		 String food1 = "pizza";
		 System.out.println(name+" favorite color and food is "+color+" and "+food1+".");
	}

}
