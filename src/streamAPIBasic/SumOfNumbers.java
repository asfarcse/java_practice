package streamAPIBasic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
		Optional<Integer> sum = intList.stream().reduce((a,b)-> (a+b));
		int sum2 = intList.stream().mapToInt(p->p).sum();
		System.out.println("sum is:::"+sum.get());
		System.out.println("sum2:::::"+sum2);
	}
}
