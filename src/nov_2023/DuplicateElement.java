package nov_2023;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,5,4,5};
		findDuplicate(arr);
	}
	
	public static void findDuplicate(int[] arr) {
	    Set<Integer> set = new HashSet<>();
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                set.add(arr[i]);
	            }
	        }
	    }
	    System.out.println(set);
	}

}
