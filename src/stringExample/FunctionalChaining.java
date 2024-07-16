package stringExample;

import java.util.Arrays;
import java.util.List;

public class FunctionalChaining {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "world", "functional", "chaining");

        // Functional chaining with streams
        long count = words.stream()
                        .map(String::toUpperCase) // Convert each string to uppercase
                        .filter(s -> s.startsWith("H")) // Filter strings starting with "H"
                        .count(); // Count the number of elements

        System.out.println("Count: " + count); // Output: Count: 1
    }
}
