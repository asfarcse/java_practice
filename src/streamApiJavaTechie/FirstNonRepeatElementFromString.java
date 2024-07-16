package streamApiJavaTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//input:asfar
//output:s
public class FirstNonRepeatElementFromString {
	public static void main(String[] args) {
		
		String input = "asfar";
		String key = Arrays
				.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue() == 1).findFirst().get().getKey();
		System.out.println("key::::"+key);
		
		
		//First repeated character
		String inputt = "Java articles are Awesome";
    	List<String> asList = Arrays.asList(inputt.split(""));
    	String keyy = asList.stream().filter(p->Collections.frequency(asList, p)>1).collect(Collectors
    			.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
    				.entrySet().stream().findFirst().get().getKey();
    	System.out.println(keyy);
		
	}
}
