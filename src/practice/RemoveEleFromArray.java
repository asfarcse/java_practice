package practice;

import java.util.Arrays;

public class RemoveEleFromArray {
	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6};
        int target = 4;
        removeElement(arr,target);
    }

	private static void removeElement(int[] arr,int target) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				shiftElement(i,arr);
				count++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(arr, arr.length-count)));
	}

	private static void shiftElement(int index, int[] arr) {
		for(int i=index;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
	}
}
