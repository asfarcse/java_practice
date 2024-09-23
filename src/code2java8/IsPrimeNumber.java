package code2java8;

import java.util.stream.IntStream;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int[] arr = { 22, 8, 56, 5, 46, 46, 99, 37, 99, 5 };
		for (Integer e : arr) {
			System.out.println(checkPrime(e));
		}
	}

	private static String checkPrime(int num) {
		int count = 1;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		return count == 2 ? "True" : "False";
	}
}
