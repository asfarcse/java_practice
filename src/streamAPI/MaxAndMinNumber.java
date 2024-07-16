package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumber {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,22,23,44,33,1,665,34,20,55,90);
		Integer minNumber = numList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		Integer maxNumber = numList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("minNumber::::"+minNumber+"\nmaxNumber"+maxNumber);
	}
}
