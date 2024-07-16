package recursion;

public class FinbonacchiRecursionExample {
	public static void main(String[] args) {
		int x=7;
		System.out.println("recusively:::"+recursiveFibonacchi(x));
		System.out.println("traditional:::"+traditionalFibonacchi(x));
	}
	// 0,1,1,2,3,5,8,13,21
	private static int recursiveFibonacchi(int n) {
		if (n <= 1) {
            return n;
        }
        else {
            return recursiveFibonacchi(n - 1) + recursiveFibonacchi(n - 2);
        }
	}

	private static int traditionalFibonacchi(int n) {
		if (n <= 1) {
            return n;
        }
		int fib1=0;
		int fib2=1;
		int fib = 0;
		
		for(int i=2;i<=n;i++) {
			fib = fib1+fib2;
			fib1 = fib2;
			fib2 = fib;
		}
		return fib;
	}
	
}
