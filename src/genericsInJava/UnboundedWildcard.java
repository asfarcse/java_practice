package genericsInJava;
//Java program to demonstrate Unbounded wildcard

import java.util.Arrays;
import java.util.List;

class UnboundedWildcard {
	public static void main(String[] args) {

		// Integer List
		List<Integer> list1 = Arrays.asList(1, 2, 3);

		// Double list
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
		
		List<Number> list3 = Arrays.asList(4, 5, 6, 7);
		
		List<String> list4 = Arrays.asList("mohd","asfar","Azmi");

		printlist(list1);
		printlist(list2);
		printlist(list3);
		printlist(list4);
	}

	private static void printlist(List<?> list) {

		System.out.println(list);
	}
}
