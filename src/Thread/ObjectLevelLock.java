package Thread;

public class ObjectLevelLock {
	public static void main(String[] args) {
		
	}
	
	public synchronized void m1() {
		System.out.println("in Method M1 and thread name is "+Thread.currentThread().getName());
	}
	
	public synchronized void m2() {
		System.out.println("in Method M2 and thread name is "+Thread.currentThread().getName());
	}
}

class Thread1 extends Thread {
	
	Thread1 () {
		
	}
	
	@Override
	public void run() {
		
	}
}

class Thread2 extends Thread {
	
	Thread2 () {
		
	}
	
	@Override
	public void run() {
		
	}
}
