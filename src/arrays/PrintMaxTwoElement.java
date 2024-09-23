package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;

/**
 * Time Complexity:𝑂(𝑛) Space Complexity: 𝑂(𝑛)
 */
class PrintMaxTwoElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6);

		Map<Integer, Long> countMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		ArrayList<Integer> finalList = new ArrayList<>();
		for (Map.Entry<Integer, Long> entry : countMap.entrySet()) {
			int number = entry.getKey();
			long count = Math.min(entry.getValue(), 2);
			for (int i = 0; i < count; i++) {
				finalList.add(number);
			}
		}
		System.out.println(finalList);
	}
}
