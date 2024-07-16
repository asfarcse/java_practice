package methodReference;

public class MethodReferenceDemo {
	public static void main(String[] args) {
		FunctionlaInterfaceDemo demo = Test::testImplementation;
		demo.singleAbsMethod();
		demo.printName();
		demo.printName1();
	}
}

class Test {
	public static void testImplementation() {
		System.out.println("This is test implementation of your abstract  method");
	}
}
