package stringExample;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		Integer[] arr = new Integer[size];
		Integer[] newArr = new Integer[10];
		System.out.println("Enter element in array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				newArr[i] = arr[i];
			}
		}
		
		for(Integer a:newArr) {
			if(a != null) {
				System.out.print(a);
			}
		}
		sc.close();
		
	}
}
