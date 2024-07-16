package leetcode;

/*
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/
public class Problem35 {
	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int target = 2;
		findInsertionIndex(arr,target);
	}
	
	public static void findInsertionIndex (int[] arr,int target) {
		for(int i=0;i<=arr.length-1;i++) {
			if(target <= arr[i]) {
				System.out.println(i);
				break;
			} 
			if(i == arr.length-1) {
				System.out.println(i+1);
			}
		}
	}
}
