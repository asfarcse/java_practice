package interviewAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**Asked in Smarsh Banglore*/
public class CompareListForDuplicateData {
	public static void main(String[] args) {
		List<Integer> list1= Arrays.asList(1,10,2,9,3,8,4,7,5,6);
		List<Integer> list2= Arrays.asList(1,10,2,9,3,8,4,7);
		System.out.println(compareList(list1,list2));
	}
	
	public static List<Integer> compareList(List<Integer> list1,List<Integer> list2) {
		return list1.stream().filter(e -> !list2.contains(e)).collect(Collectors.toList());
	}
} 
