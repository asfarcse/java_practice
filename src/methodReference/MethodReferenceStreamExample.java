package methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceStreamExample {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Asfar","Adil","Kashif","Abid");
		nameList.stream().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		nameList.stream().map(MethodReferenceStreamExample::addPrefix).forEach(System.out::println);
	}
	
	public static String addPrefix(String str) {
		return "Mohd "+str;
	}
}

