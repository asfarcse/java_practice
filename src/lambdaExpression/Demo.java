package lambdaExpression;

@FunctionalInterface
interface Adder {
	int add(int a,int b);
}
public class Demo {
	public static void main(String[] args) {
		Adder adder = (a,b)->a+b;
		int add = adder.add(4, 5);
		System.out.println(add);
	}
}
