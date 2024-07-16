package sortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] numArr = {36,19,29,12,5};
		sortNumbers(numArr);
		System.out.println(Arrays.toString(numArr));
	}

	private static void sortNumbers(int[] arr) {
		int temp,j;
		for(int i=1;i<arr.length;i++) {
			temp = arr[i];
			j=i;
			while(j>0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
	}
}
