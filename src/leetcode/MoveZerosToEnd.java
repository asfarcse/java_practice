package leetcode;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 5, 0, 3, 2, 0 };
		moveZeros(arr);
	}

	public static void moveZeros(int[] arr) {
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}

		while (count < arr.length) {
			arr[count++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
