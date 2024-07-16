package streamApiJavaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concat2List {
	
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("mohd","asfar"); 
		List<String> list2 = Arrays.asList("java","developer");
		List<String> list3 = Arrays.asList("hyderabad","indore");
		
		
		List<String> twoListInOne = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		System.out.println(twoListInOne);
		
		List<String> threeListInOne = Stream.concat(Stream.concat(list1.stream(), list2.stream()), list3.stream()).distinct().collect(Collectors.toList());
		System.out.println(threeListInOne);
	}
}
