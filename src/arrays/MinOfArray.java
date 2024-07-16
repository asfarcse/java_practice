package arrays;

public class MinOfArray {
	public static void main(String[] args) {
		int[] arr = {22,8,56,46,37,99,1,5};
		System.out.println(findMinElement(arr));
	}
	
	public static int findMinElement(int[] arr) {
		int min = arr[0];
		for(Integer val:arr) {
			if(min > val) {
				min = val;
			}
		}
		return min;
	}
}
