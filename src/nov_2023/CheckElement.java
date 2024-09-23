package nov_2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckElement {
	public static void main(String[] args) {
		int[] arr = {1,2,1,6,5,4,5};
		findElement(arr,6);
	}
	
	public static void findElement(int[] arr,int element) {
		
		for(Integer num:arr) {
			if(num != element) {
				continue;
			} else {
				System.out.println("present");
				return;
			}
		}
		
		System.out.println("not present");
		
//		List<Integer> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		if(intList.contains(element)) {
//			System.out.println("Element is present...");
//		} else {
//			System.out.println("Element is not present...");
//		}
	}
}
