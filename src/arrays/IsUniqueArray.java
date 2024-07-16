package arrays;

import java.util.HashSet;

public class IsUniqueArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		System.out.println(checkUnique(arr));
	}
	
	
	public static boolean checkUnique(int[] arr) {
		HashSet<Integer> seenElements = new HashSet<>();
        for (int num : arr) {
            if (seenElements.contains(num)) {
                return false;
            }
            seenElements.add(num);
        }
        return true;
	}
}
