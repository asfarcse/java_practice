package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperations {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Asfar");
		memberNames.add("Shivek");
		memberNames.add("Shree");
		memberNames.add("Dheeraj");
		memberNames.add("Lokesh");
		memberNames.add("Manish");
		memberNames.add("Ankita");
		memberNames.add("Tushar");
		
		memberNames.forEach(System.out::println);
		System.out.println("*******************************");
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
		System.out.println();
		System.out.println("*******************************");
		
		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("A"));
		System.out.println("any match::"+matchedResult);   
		 
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("A"));
		System.out.println("all match::"+matchedResult);     
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("A"));
		System.out.println("none match::"+matchedResult); 
		System.out.println("*******************************");
		
		long totalMatched = memberNames.stream()
			    .filter((s) -> s.startsWith("T"))
			    .count();
			 
		System.out.println(totalMatched);
		System.out.println("*******************************");
		
		Optional<String> reduced = memberNames.stream()
		        .reduce((s1,s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);
		
		
	}
}
