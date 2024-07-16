package streamApiInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> collect = intList.stream().filter(n->Collections.frequency(intList, n)>1).collect(Collectors.toList());
		System.out.println("collect:::::::"+collect);
		
	}

}
