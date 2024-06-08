package java8;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	  public List<String> search(List<String> list) {
	        return list.stream()
	                   .filter(s -> s.startsWith("a") && s.length() == 3)
	                   .collect(Collectors.toList());
	    }
}
