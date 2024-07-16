package sortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numArr = { 36, 19, 29, 12, 5 };
		String[] strArr = {"moazzam","asfar","mehdi"};
		sortNumbers(numArr);
		sortString(strArr);
		System.out.println(Arrays.toString(numArr));
		System.out.println(Arrays.toString(strArr));
	}

	private static void sortString(String[] strArr) {
		for(int i=0;i<strArr.length;i++) {
			boolean flag = false;
			for(int j=0;j<strArr.length-1-i;j++) {
				if(strArr[j].compareTo(strArr[j+1])>0) {
					String temp = strArr[j];
					strArr[j] = strArr[j+1];
					strArr[j+1] = temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}

	private static void sortNumbers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
	}
}
