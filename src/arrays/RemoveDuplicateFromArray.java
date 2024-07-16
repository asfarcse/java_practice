package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		Integer size = sc.nextInt();
		Integer[] arr = new Integer[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Set<Integer> collect = Arrays.stream(arr).collect(Collectors.toSet());
		System.out.println(collect);
		
		
	}
}
