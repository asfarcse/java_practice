package streamApiJavaTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * input: {5,9,11,2,8,21,1}
 * output: 11
 * */
public class SecondHighestNumberFromArray {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5,9,11,2,8,21,1);
		Integer integer = numList.stream().sorted().skip(numList.size()-2).findFirst().get();
		Integer integer1 = numList.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println("integer::::"+integer);
		System.out.println("integer::::"+integer1);
	}
}
