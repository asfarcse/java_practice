package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamIntermediateOperations {
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
		
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		memberNames.stream().filter((s) -> s.startsWith("S")).forEach(System.out::println);
		memberNames.stream().filter((s) -> s.startsWith("B")).forEach(System.out::println);
		System.out.println("**********************************");
		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println("**********************************");
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}
}
