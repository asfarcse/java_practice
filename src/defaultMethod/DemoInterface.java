package defaultMethod;

public interface DemoInterface {
	void m1();
	default void printMsg() {
		System.out.println("demo message");
	}
}
