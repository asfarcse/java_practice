package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceExample {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5,4,10,1,2,3,4);
		List<Integer> result = numList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println();
		System.out.println(result);
		
		int sum = numList.stream().mapToInt(p->p).sum();
		Integer sum1 = numList.stream().reduce((a,b)-> a+b).get();
		System.out.println(sum);
		System.out.println(sum1);
	}
}
