package sortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] numArr = { 36, 19, 29, 12, 5 };
		sortNumbers(numArr);
		System.out.println(Arrays.toString(numArr));
		String[] strArr = {"moazzam","asfar","mehdi","demo"};
		sortString(strArr);
		System.out.println(Arrays.toString(strArr));

	}

	private static void sortString(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[min])<0) {
					min = j;
				}
			}
			String temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
	private static void sortNumbers(int[] numArr) {
		for(int i=0;i<numArr.length;i++) {
			int min=i;
			for(int j=i+1;j<numArr.length;j++) {
				if(numArr[j] < numArr[min]) {
					min = j;
				}
			}
			int temp = numArr[i];
			numArr[i]=numArr[min];
			numArr[min]=temp;
		}
	}
}
