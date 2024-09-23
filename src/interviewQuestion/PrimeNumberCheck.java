package interviewQuestion;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); // false
		System.out.println(isPrime(2)); // true
		System.out.println(isPrime(3)); // true
		System.out.println(isPrime(5)); // true
		System.out.println(isPrime(7)); // true
		System.out.println(isPrime(11)); // true
		System.out.println(isPrime(22)); // false
	}

	public static boolean isPrime(int n) {
		int count=1;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count ==2 ? true: false;
	}

}
