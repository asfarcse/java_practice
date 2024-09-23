package leetcode;

//TimeComplexity Should be O(log n)
public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target=0;
		
		System.out.println(searchElement(arr,target));
	}

	private static int searchElement(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
