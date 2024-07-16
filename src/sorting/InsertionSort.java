package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] arr = {5,1,9,2,10};
		printArray(arr);
		is.sortMethod(arr);
		System.out.println();
		printArray(arr);
		
	}
	
	public void sortMethod(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
	}
}
