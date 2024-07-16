package streamApiInterview;

import java.util.Arrays;

public class SortArraysUsingParallelSort {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,2,4,6,8};
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
