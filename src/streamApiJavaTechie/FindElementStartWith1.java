package streamApiJavaTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementStartWith1 {
	public static void main(String[] args) {
		int[] intArr = {5,9,11,2,8,21,1};
		List<Integer> numList = Arrays.asList(5,9,11,2,8,21,1);
		List<String> collect = numList
							   .stream()
							   		.map(p->p.toString())
							   			.filter(p->p.startsWith("1"))
							   				.collect(Collectors.toList());
		List<String> collect1 = Arrays
				.stream(intArr)
					.boxed()
			   			.map(p->p.toString())
			   				.filter(p->p.startsWith("1"))
			   					.collect(Collectors.toList());
		
		System.out.println("collect:::::"+collect);
		System.out.println("collect1:::::"+collect1);
		
	}
}
