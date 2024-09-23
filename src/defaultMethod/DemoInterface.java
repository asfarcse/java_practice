package defaultMethod;

//@FunctionalInterface
public interface DemoInterface {
	void m1();
	default void m2ForClass1() {
		System.out.println("Dmeo body");
	}
	default void printMsg() {
		System.out.println("demo message from interface");
	}
	
	/**as a utility  methoid*/
	static boolean checkIntegerValue(Object num) {
		if(num.getClass().toString().equals("class java.lang.Integer")) {
			return true;
		} else {
			return false;
		}
	}
}
