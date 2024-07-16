package staticMethod;

public interface StaticInterface {
	
	static void method() {
		System.out.println("body of static method");
	}
	
	default void method1() {
		System.out.println("body of default method");
	}
}
