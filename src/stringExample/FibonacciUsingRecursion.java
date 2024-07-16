package stringExample;

public class FibonacciUsingRecursion {
	public static void main(String[] args) {
		System.out.println(fib(5));
	}
	
	// 0 1 1 2 3 5
	public static int fib(int n) {
		if(n<=1) {
			return n;
		} else {
			return fib(n-1)+fib(n-2);
		}
	}
}
