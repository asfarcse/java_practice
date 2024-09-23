package leetcode;

import java.util.Arrays;

public class TwoSum2 {
	public static void main(String[] args) {
		Integer[] arr = {2,7,11,15};
		Integer target=26;
		Integer[] newArr = {0,0};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					newArr[0]=i;
					newArr[1]=j;
				}
			}
		}
		
		System.out.println(Arrays.toString(newArr));
	}
}
