package inheritance;


class A {
	void method1() {
		System.out.println("A class method1...");
	}
	
	void method2() {
		System.out.println("A class method2...");
	}
}

class B extends A {
	void method1() {
		System.out.println("B class method1...");
	}
	
	void method2() {
		System.out.println("B class method2...");
	}
	void method3() {
		System.out.println("B class method3...");
	}
	
	void method4() {
		System.out.println("B class method4...");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		B b = new B();
		b.method1();
		b.method2();
		b.method4();
		b.method4();
		
		A a = new A();
		a.method1();
		a.method2();
		
		A aa = new B();
		aa.method1();
		aa.method2();
	}
}
