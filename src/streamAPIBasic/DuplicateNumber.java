package streamAPIBasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(2,3,4,5,6,7,8,9,10,7,6,5,4,3,2,1);
//		Set<Integer> set = new HashSet<>();
//		Set<Integer> newSet = intList.stream().filter(p->!set.add(p)).collect(Collectors.toSet());
		
		Set<Integer> newSet = intList.stream().filter(n-> Collections.frequency(intList, n)>1).collect(Collectors.toSet());
		
		System.out.println("newSet:::::"+newSet);
	}
}
