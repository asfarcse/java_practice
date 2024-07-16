package streamAPIBasic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordOfArray {
	public static void main(String[] args) {
		String[] words = { "hii", "how", "are", "you" };
		String collect = Arrays.stream(words).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining("-"));

		System.out.println(collect);
	}
}
