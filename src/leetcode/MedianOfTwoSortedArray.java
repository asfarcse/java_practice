package leetcode;

import java.util.Arrays;

//O(log(m+n))
public class MedianOfTwoSortedArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3 };
		int[] arr2 = { 0, 2 };
		int[] arr3 = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}

		// copy remaining element of arr1
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}

		// copy remaining element of arr2
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}

		System.out.println(Arrays.toString(arr3));
		
		double median;
		if (arr3.length % 2 == 0) {
			// Even number of elements
			median = (arr3[arr3.length / 2 - 1] + arr3[arr3.length / 2]) / 2.0;
		} else {
			// Odd number of elements
			median = arr3[arr3.length / 2];
		}

		System.out.println("median is::::: " + median);

	}
}
