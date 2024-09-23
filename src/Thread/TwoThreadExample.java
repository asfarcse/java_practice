package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import stringExample.FibonacciUsingRecursion;

class Threadd extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread class extends Thread:::"+i);
		}
	}
}


public class TwoThreadExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Thread t1 = new Thread(() -> {
			for(int i=0;i<=5;i++) {
				System.out.println("Thread-1 "+i);
			}
		}, "T1");

		Thread t2 = new Thread(() -> {
			for(int i=0;i<=5;i++) {
				System.out.println("Thread-2 "+i);
			}
		}, "T2");
		
		Runnable r = ()->{
			for(int i=0;i<=5;i++) {
				System.out.println("Runnable "+i);
			}
		};
		
		
		t1.start();
		t1.join();
		t2.start();
		
		Thread run = new Thread(r);
		run.start();
		
		Callable<Integer> call = ()->{
			return 42;
		};
		
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Integer> future = es.submit(call);
		Integer value = future.get();
		es.shutdown();
		
		System.out.println("value:::::"+value);
		
		Threadd thread = new Threadd();
		thread.start();
		
		
	}
}
