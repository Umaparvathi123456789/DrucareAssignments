package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");

		long count=names.stream()
				   .filter(data->data.length()>3)
				   .count();
		System.out.println("Count of datas having length greater than 3 : "+count);

		List<String> namesUpper=names.stream()
				                .map(String::toUpperCase)
				                .collect(Collectors.toList());
		System.out.println(namesUpper);


		List<String> cityList = Arrays.asList("chennai", "mumbai", "bangalore", " ", "delhi", "chicago");

		List<String> cityUpper=cityList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		System.out.println(cityUpper);

		List<String> citycount=cityList.stream()
				   .filter(data->data.length()>6)
				   .collect(Collectors.toList());
		System.out.println("Cities whose length is greaterthan 6 :"+citycount);

		List<String> cityStartWithC=cityList.stream()
				                    .filter(name->name.startsWith("c"))
				                    .collect(Collectors.toList());
		System.out.println("Cities start with c :"+cityStartWithC);

		
		List<String> cityContainsAI=cityList.stream()
				                    .filter(city->city.contains("ai"))
				                    .collect(Collectors.toList());
		System.out.println("Cities containing ai :"+cityContainsAI);


		System.out.println("---------------------");

		List<String> appendMetro=cityList.stream()
				                 .map(city->city.concat("metro"))
				                 .collect(Collectors.toList());
		System.out.println("appending metro :" +appendMetro);

		
		long cityCountStartWithC=cityList.stream()
                .filter(name->name.startsWith("c"))
                .count();
        System.out.println("Cities start with c :"+cityCountStartWithC);

        long emptyString=cityList.stream()
        		                 .filter(String::isEmpty)
        		                 .count();
		System.out.println("count of empty string :" +emptyString);

		List<String> removeEmptyString=cityList.stream()
                .filter(city->city.length()!=0)
                .collect(Collectors.toList());
        System.out.println("remove of empty string :" +removeEmptyString);


	}
}
