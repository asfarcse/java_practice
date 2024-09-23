package collectionexample;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfFeatureJava9 {
	public static void main(String[] args) {
		List<Integer> oddNum = List.of(1, 3, 5, 7, 9);
		Set<Integer> evenNum = Set.of(2, 4, 6, 8, 10);
		Map<String, Integer> numPair = Map.of("one", 1, "two", 2, "three", 3);
		
		System.out.println(oddNum+":::"+evenNum+":::"+numPair);
		
	}
}
