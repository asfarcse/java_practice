package streamAPI;

import java.util.Arrays;
import java.util.List;

public class AvrgOfNumbers {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		double average = intList.stream().mapToInt(n->n).average().getAsDouble();
		System.out.println("average:::::"+average);
	}
}
