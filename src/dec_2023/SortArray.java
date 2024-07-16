package dec_2023;

import java.util.Arrays;
import java.util.List;

public class SortArray {
	
	public static void main(String[] args) {
		int[] arr = {7,4,5,3,2,1};
		sortArrayMethod(arr);
		Arrays.stream(arr).forEach(x-> System.out.print(x));
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println();
		System.out.println(list.contains(10));
	}
	
	public static void sortArrayMethod(int[] arr) {
		Arrays.sort(arr);
	}
	
}
