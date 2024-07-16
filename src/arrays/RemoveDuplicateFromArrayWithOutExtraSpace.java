package arrays;

import java.util.Arrays;

public class RemoveDuplicateFromArrayWithOutExtraSpace {
	public static void main(String[] args) {
		
		String[] arr = {"a","b","a","b","c","d"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					arr[j]="";
					shiftElement(arr,j);
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	private static void shiftElement(String[] arr, int index) {
		for(int i=index;i<arr.length-1;i++) {
			arr[index] = arr[index+1];
		}
	}
}
