package task;

import java.util.HashMap;
import java.util.Map;

public class CountOfLanguages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String languages = "eng chinese eng telugu chinese hindi chinese";

	        String[] languageList = languages.split(" ");
	        Map<String, Integer> languageCount = new HashMap<>();
	        for (String language : languageList) {
	            languageCount.put(language, languageCount.getOrDefault(language, 0) + 1);
	        }
	        for (Map.Entry<String, Integer> entry : languageCount.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        System.out.println();
	        int duplicateCount = 0;
	        for (int count : languageCount.values()) {
	            if (count > 1) {
	                duplicateCount += count - 1;
	            }
	        }
	        //number of duplicates
	        System.out.println("Total number of duplicates: " + duplicateCount);
	}

}
