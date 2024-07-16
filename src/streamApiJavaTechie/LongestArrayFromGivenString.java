package streamApiJavaTechie;

import java.util.Arrays;
import java.util.List;

public class LongestArrayFromGivenString {
	public static void main(String[] args) {

		List<String> asList = Arrays.asList("mohd", "asfar", "indore", "hyderabad");
		String resultUsingReduce = asList
				.stream()
					.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
						.get();
		String resultUsingMax = asList
				.stream()
					.max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
						.get();
		System.out.println("collect::::" + resultUsingReduce);
		System.out.println("collect::::" + resultUsingMax);

	}
}
