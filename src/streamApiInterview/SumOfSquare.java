package streamApiInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfSquare {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Integer integer = intList.stream().map(n->n*n).reduce((a,b)->(a+b)).get();
//		int sum = intList.stream().map(n ->n*n).reduce((a,b)-> a+b).get();
		System.out.println(integer);
	}
}
