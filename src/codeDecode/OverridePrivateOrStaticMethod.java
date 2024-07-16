package codeDecode;

class Parent {
	public static void m1() {
		System.out.println("body of private m1");
	}
}

public class OverridePrivateOrStaticMethod extends Parent{
	public static void m1() {
		System.out.println("body of private child class");
	}
	
	public static void main(String[] args) {
		OverridePrivateOrStaticMethod obj = new OverridePrivateOrStaticMethod();
		m1();
	}
}
