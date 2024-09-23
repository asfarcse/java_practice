package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IsUniqueArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		System.out.println(checkUnique(arr));
		System.out.println(checkUniqueUsingCollection(arr));
	}
	
	
	private static boolean checkUniqueUsingCollection(int[] arr) {
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		
		if(arr.length != set.size()) {
			return false;
		}
		return true;
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
