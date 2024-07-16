package functionalInterface;

@FunctionalInterface
interface A {
	void m1();
}

//@FunctionalInterface
interface B extends A{
	void m2();
}

public class FunctionalInterfaceExtending {
	public static void main(String[] args) {
		A a = ()->System.out.println("Hello");
		a.m1();
	}
}
