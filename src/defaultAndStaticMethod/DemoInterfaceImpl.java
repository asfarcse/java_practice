package defaultAndStaticMethod;

public class DemoInterfaceImpl{
	public static void main(String[] args) {
		DemoForInterface demoForInterface = new DemoForInterface();
		demoForInterface.demoMethod();
		demoForInterface.m1();
		DemoInterface.staticMethod();
	}
}

class DemoForInterface implements DemoInterface {

	@Override
	public void demoMethod() {
		System.out.println("Hello from demoMethod");
	}
	
	@Override
	public void m1() {
		System.out.println("overrided the default method in implementation class");
	}
	
	
	
//	static void staticMethod() {
//		System.out.println("Hello from static method which is overridden in implemnattion class");
//	}
//	
}
