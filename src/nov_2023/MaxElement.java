package nov_2023;

public class MaxElement {
	public static void main(String[] args) {
		int[] arr = {1,2,1,6,5,4,5};
		findMaxElement(arr);
	}
	
	public static void findMaxElement(int[] arr) {
		int max=arr[0];
		for(Integer i:arr) {
			if(max < i) {
				max=i;
			}
		}
		System.out.println("max value is::::"+max);
	}
}
