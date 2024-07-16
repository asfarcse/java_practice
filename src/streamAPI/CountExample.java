package streamAPI;

import java.util.Arrays;
import java.util.List;

public class CountExample {
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(2,3,4,5,6,7,8,9,10,7,6,5,4,3,2,1);
		long count = intList.stream().count();
		
		System.out.println("newSet:::::"+count);
	}
}
