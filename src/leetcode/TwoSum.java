package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*input will be an array of integer and a target value
 * example [2,7,11,9] target=0
 * output [0,1]
 * 2+7=9
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int target = 13;
		
		int[] findIndexes = findIndexes(arr,target);
		System.out.println(Arrays.toString(findIndexes));
	}

	private static int[] findIndexes(int[] arr, int target) {
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
	
	private static int[] findIndexesWithHashMap(int[] arr, int target) {
		Map<Integer, Integer> input = new HashMap<>();
		for(int i=0;i<=arr.length;i++) {
			
		}
		return new int[] {};
	}
}
