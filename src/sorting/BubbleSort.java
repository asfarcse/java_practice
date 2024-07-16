package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {0,1,1,2,0,1,2,0,1,0,2,0,1};
		printArray(arr);
		BubbleSort bs = new BubbleSort();
		bs.sortMethod(arr);
		System.out.println();
		printArray(arr);
	}
	
	public void sortMethod(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean isSwapped = false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(isSwapped == false) {
				break;
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
	}
}
