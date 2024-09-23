package staticMethod;

public class Main implements StaticInterface {
	
	void method() {
		System.out.println("body of normal method");
	}
	
	public static void main(String[] args) {
		StaticInterface.method();
		
		Main obj = new Main();
		obj.method1();
		obj.method();
	}
}
