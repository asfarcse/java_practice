package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortNumbers {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,22,23,44,33,1,665,34,20,55,90);
		List<Integer> ascendingList = numList.stream().sorted().collect(Collectors.toList());
		System.out.println("ascendingList::::"+ascendingList);
		List<Integer> decendingList = numList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("decendingList::::"+decendingList);
	}
}
