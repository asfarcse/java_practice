package interviewCodingQuestion;

import java.util.Arrays;

public class DeleteElementFromArray {
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9,2,9,4,6,7};
		int target = 9;
		System.out.println(Arrays.toString(removeElement(arr,target)));
	}
	
	public static int[] removeElement(int[] arr, int target) {
//		System.out.println(arr.length);
		int count = 0;
		for(Integer num:arr) {
			if(num == target)
				count++;
		}
		
		int[] newArr = new int[arr.length-count];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(target != arr[i]) {
				newArr[index] = arr[i];
				index++;
			}
		}
		return newArr;
	}
}
