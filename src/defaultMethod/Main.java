package defaultMethod;

public class Main implements DemoInterface{
	public void m1() {
		System.out.println("abstract method");
	}
	
//	@Override
//	public void printMsg() {
//		System.out.println("L::::::::::::::::");
//	}
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.printMsg();
		mainObj.m1();
	}

}
