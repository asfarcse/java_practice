package functionalInterface;

@FunctionalInterface
interface Interface1 {
	void m1();
	default void m2() {
		System.out.println("Hii");
	}
}

@FunctionalInterface
interface Interface2 extends Interface1{
	void m1();
}

public class FunctionalInterfaceExtend {
	public static void main(String[] args) {
		
	}
}
