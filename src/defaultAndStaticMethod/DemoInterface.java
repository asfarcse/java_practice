package defaultAndStaticMethod;

@FunctionalInterface
public interface DemoInterface {
	void demoMethod();
	default void m1() {
		System.out.println("Hello from default method");
	}
	
	static void staticMethod() {
		System.out.println("Hello from static method");
	}
}
