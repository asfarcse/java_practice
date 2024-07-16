package Thread;

public class ThreadClass extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("I am executed by a child thread");
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();
		t1.setName("seema");
		t1.start();
		for(int i=0;i<=5;i++) {
			System.out.println("I am executed by a main thread");
			System.out.println(Thread.currentThread().getName());
		}
	}
}

