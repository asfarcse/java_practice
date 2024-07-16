package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class ShortCircuitOperations {
	public static void main(String[] args) {
		/**
		 * Though stream operations are performed on all elements inside a collection satisfying a Predicate, it is often desired to break the operation whenever a matching element is encountered during iteration.In external iteration, we will do with the if-else block. In the internal iterations such as in streams, there are certain methods we can use for this purpose.
		 *
		 */
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Asfar");
		memberNames.add("Shivek");
		memberNames.add("Shree");
		memberNames.add("Dheeraj");
		memberNames.add("Lokesh");
		memberNames.add("Manish");
		memberNames.add("Ankita");
		memberNames.add("Tushar");
		
		boolean matched = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("A"));
		System.out.println(matched);
		
		String firstMatchedName = memberNames.stream()
	            .filter((s) -> s.startsWith("L"))
	            .findFirst()
	            .get();
		System.out.println(firstMatchedName);
	}
}
