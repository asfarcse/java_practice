package arrays;

public class SortNumArray {
	public static void main(String[] args) {
		int[] arr = {4,2,5,3,7,5,8,6};
		sortingMethod(arr);
		printMethod(arr);
	}

	private static void sortingMethod(int[] arr) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	private static void printMethod(int[] arr) {
		for(Integer i:arr) {
			System.out.print(i);
		}
	}

}
