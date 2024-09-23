package interviewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fibonacciBF(5)));
		System.out.println(fibonacciRecursive(5));
	}

	private static int fibonacciRecursive(int n) {
		if(n == 0 || n ==1 )
			return n;
		else 
			return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
	}

	private static int[] fibonacciBF(int n) {
		int[] arr = new int[n + 1];
		int a = 0;
		int b = 1;
		for (int i = 0; i <= n; i++) {
			arr[i] = a;
			int c = a + b;
			a = b;
			b = c;
		}
		return arr;
	}
}
