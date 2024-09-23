package javaFeaureVersionWise.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.Map.entry;

/**In Collection.of method, null is not allowed */
public class OfMethod {
	public static void main(String[] args) {
		List<Integer> oddNum = List.of(1, 3, 5, 7, 9);
		Set<Integer> evenNum = Set.of(2, 4, 6, 8, 10);
		Map<String, Integer> numPair = Map.of("one", 1, "two", 2, "three", 3);
		
		System.out.println(oddNum+":::"+evenNum+":::"+numPair);
		
		/**extra feature for map with static import of entry from Map class*/
		System.out.println("****extra feature for map with static import of entry from Map class***55");
		Map<String, Integer> ofEntries = Map.ofEntries(entry("one",1),entry("two",2),entry("three",3));
		ofEntries.forEach((k,v)->System.out.println(k+"==>"+v));
	}
}
