package code2java8;

import java.util.stream.IntStream;

public class IsPrimeNumber {
	public static void main(String[] args) {
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		System.out.println(isPrime(6));
		
	}
	public static Boolean isPrime(int num) {
		int count = 1;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
//		System.out.println("count"+count);
		return count==2?true:false;
//		return IntStream.range(2, num).noneMatch(n->num%n==0);
	}
}
