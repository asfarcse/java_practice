package functionalInterface.multiply2NumberByFunctionalInterface;

public class FuncInterfaceImpl {
	public static void main(String[] args) {
		
		FuncInterface method = (a,b)->(a*b);
		int result = method.multiply(2, 3);
		
		System.out.println("result::::"+result);
	}
}
