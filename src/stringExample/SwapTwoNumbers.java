package stringExample;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		swapWithTemp(1, 2);
		System.out.println("****************************");
		swapWithoutTemp(2, 1);
	}

	private static void swapWithTemp(int a, int b) {
		System.out.println("before swap:::"+a+" & "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swap:::"+a+" & "+b);
	}

	private static void swapWithoutTemp(int a, int b) {
		System.out.println("before swap:::"+a+" & "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap:::"+a+" & "+b);

	}

}
