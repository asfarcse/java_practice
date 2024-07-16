package streamAPIBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AvrgOfNumbers {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		Optional<Integer> average = intList.stream().reduce((a,b)->a+b);
		System.out.println("average:::::"+average.get());
	}
}
