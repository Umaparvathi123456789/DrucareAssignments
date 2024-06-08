package task;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonTask {
	public static void main(String[] args) {
		Consumer<Personn> consumer = (personn) -> System.out.println(personn);
		//Changing Gender to upper case
	    Consumer<Personn> genderConsumer = (personn) -> System.out.println(personn.getGender().toUpperCase());
	   
	    List<Personn> personList = PersonRepository.getAllPersons();
	    
	    personList.forEach(genderConsumer);
	    
	    System.out.println("---------------------------");
	    
	    //incrementing the salary 1000
	     Consumer<Personn> salaryConsumer= (personn)->System.out.println(personn.getSalary()+1000);
	     
	     personList.forEach(salaryConsumer);
	}

}
