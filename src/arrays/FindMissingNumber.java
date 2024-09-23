package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to find the missing number in an array of integers from 1 to n
public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,5,3,6,8};
//		System.out.println(getMissingNumber(arr, 8));
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(getMissingNumber(arr));
		System.out.println(getMissingUsingHashing(arr));
	}
	
	private static List<Integer> getMissingUsingHashing(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		List<Integer> returnList = new ArrayList<>();
		int[] hashArr = new int[max];
		
		for(int i=0;i<arr.length-1;i++) {
			hashArr[arr[i]]++;
		}
		
		for(int i=1;i<hashArr.length;i++) {
			if(hashArr[i] == 0) {
				returnList.add(i);
			}
		}
		return returnList;
	}

	/**no need to sort using this technique*/
	public static int getMissingNumber(int[] arr) {
		int totalSum = 0;
		int actualSum = 0;
		int size=arr.length;
		for(Integer i:arr) {
			totalSum += i;
		}
		for(int i=1;i<=size;i++) {
			actualSum += i;
		}
		return Math.abs(actualSum-totalSum);
	}
	
	/**sort array using bubble sort*/
	public static void sortArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static int findMissedElement(int[] arr) {
		int missingElement=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i] != 1) {
				missingElement =  i+2;
			}
		}
		return missingElement;
	}
}
