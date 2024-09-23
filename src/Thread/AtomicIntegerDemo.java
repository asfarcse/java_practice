package Thread;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
	
//	AtomicInteger count = new AtomicInteger();
	Integer count=0;
	
	/**Atomic increment operation*/
	public synchronized void increment () {
//		count.incrementAndGet();
		count++;
	}
	
	/**Atomic read operation*/
	public int getCount() {
//		return count.get();
		return count;
	}
}

public class AtomicIntegerDemo {
	public static void main(String[] args) throws InterruptedException {
		AtomicCounter counter = new AtomicCounter();
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<500;i++) {
				counter.increment();
			}
		},"Thread-1");
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<500;i++) {
				counter.increment();
			}
		},"Thread-2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("count value::::::"+counter.getCount());
	}
}
