package Thread;

public class AnonymouseInnerClassDeadlock {

	Object ob1 = new Object();
	Object ob2 = new Object();
	
	
	/**anonymouse inner class*/
	Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			while (true) {
				synchronized (ob1) {
					System.out.println("synchronized ob1 Thread-1");
					synchronized (ob2) {
						System.out.println("synchronized ob2 Thread-1");
					}
				}
			}
		}
	});

	/**anonymouse inner class*/
	Thread t2 = new Thread(new Runnable() {
		@Override
		public void run() {
			while (true) {
				synchronized (ob2) {
					System.out.println("synchronized ob2 Thread-2");
					synchronized (ob1) {
						System.out.println("synchronized ob1 Thread-2");
					}
				}
			}
		}
	});
	
	/**using lambda*/
	Thread t3 = new Thread(() -> {
		while (true) {
			synchronized (ob2) {
				System.out.println("synchronized ob2 Thread-2");
				synchronized (ob1) {
					System.out.println("synchronized ob1 Thread-2");
				}
			}
		}
	});

	public static void main(String[] args) {
		DeadlockInTwoThread obj = new DeadlockInTwoThread();
		obj.t1.start();
		obj.t2.start();
	}
}
