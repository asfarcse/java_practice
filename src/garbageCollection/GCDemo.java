package garbageCollection;

public class GCDemo {
	public static void main(String[] args) {
		GCDemo gcDemo =new  GCDemo();
		gcDemo = null;
		
		System.gc();
//		Runtime.getRuntime().gc();
		System.out.println("Main method");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method is called...");
		super.finalize();
	}
}
