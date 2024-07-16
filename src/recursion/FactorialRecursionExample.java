package recursion;

/*
 *input=4
 *output=4*3*2*1=24 
 */
public class FactorialRecursionExample {
	public static void main(String[] args) {
		System.out.println("recusively:::"+recursiveFactorial(4));
//		System.out.println("traditional:::"+traditionalFactorial(4));
	}
	
	public static int recursiveFactorial(int n) {
		if(n==1 || n==0) {
			return 1;
		} else {
			return n*recursiveFactorial(n-1);
		}
	}
	
//	public static int traditionalFactorial(int n) {
//		int result = 1;
//		if(n==1 || n==0) {
//			return 1;
//		} else {
//			for(int i=n;i>1;i--){
//				result = result*i;
//			}
//		}
//		return result;
//	}
}
