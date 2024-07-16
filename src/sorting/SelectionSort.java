package sorting;
/**
 *we will devide the array into two parts, sorted and unsorted.
 *will pick minimum element from unsorted part and swap in sorted part 
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] arr = {5,1,9,2,10};
		printArray(arr);
		ss.sortMethod(arr);
		System.out.println();
		printArray(arr);	
	}
	
	public void sortMethod(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < min) {
					min=arr[j];
				}
			}
			int temp = arr[i];
			arr[i]=min;
			arr[i+1] = temp;
		}
	}
	
	public static void printArray(int[] arr) {
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
	}
}
