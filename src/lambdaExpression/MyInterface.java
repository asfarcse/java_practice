package lambdaExpression;

@FunctionalInterface
public interface MyInterface {
	void sayHello();
	default void myMethod() {
		System.out.println("default method");
	}
	
	static void staticMethod() {
		System.out.println("static method");
	}
}


//create separate class and implement this interface or use anonymous class concept
