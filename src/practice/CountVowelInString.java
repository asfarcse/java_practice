package practice;

import java.util.Arrays;
import java.util.List;

public class CountVowelInString {
	public static void main(String[] args) {
		String str = "asfar";
		List<String> asList = Arrays.asList(str.split(""));

		long count = asList.stream().filter(p -> p.equalsIgnoreCase("a") || p.equalsIgnoreCase("e")
				|| p.equalsIgnoreCase("i") || p.equalsIgnoreCase("o") || p.equalsIgnoreCase("u")).count();
		System.out.println(count);
		int charCount = 0;
		for (int i = 0; i < asList.size(); i++) {
			switch (asList.get(i)) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				charCount++;
			}
		}
		
		System.out.println(charCount);
	}
}
