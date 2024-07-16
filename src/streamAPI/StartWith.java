package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {
	 public static void main(String args[]) {
	        List<String> list = new ArrayList<>();
	        list.add("asfar");
	        list.add("kashif");
	        list.add("adil");
	        List<String> newList = list.stream().filter(s-> s.startsWith("a")).collect(Collectors.toList());
	        System.out.print(newList);
	    }
}
