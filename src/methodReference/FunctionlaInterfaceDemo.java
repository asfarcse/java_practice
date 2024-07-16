package methodReference;

@FunctionalInterface
public interface FunctionlaInterfaceDemo {
	
	void singleAbsMethod();
	
	default void printName() {
		System.out.println("printName:::");
	}
	
	default void printName1() {
		System.out.println("printName1:::");
	}
}
