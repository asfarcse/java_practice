package arrays;

import java.util.Arrays;

public class DutchNatinalFlagProblemSelf {
	public static void main(String[] args) {
		int[] arr = {2,1,0,2,1,0};
		sortElementByDNF(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sortElementByDNF(int[] arr) {
		int low=0;
		int mid=0;
		int high = arr.length-1;
		
		while(mid <= high) {
			switch(arr[mid]) {
				case 0:
					swap(arr,mid,low);
					low++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					swap(arr,high,mid);
					high--;
			}
		}
	}
	
	public static void swap(int[] arr,int low,int mid) {
		int temp = arr[low];
		arr[low] = arr[mid];
		arr[mid] = temp;
	}
	
}
