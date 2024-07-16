package executorFramework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Service3 implements Callable<String> {
	int i;
	
	public Service3 (int i) {this.i = i;}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		System.out.println("in thread "+i);
		return "from thread "+i;
	}
	
}

public class ExecutorExample3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		System.out.println("startTime:::"+new Date());
		List<Future<String>> futureList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			//future store data recieved by submit
			futureList.add(es.submit(new Service3(i)));
		}
		es.shutdown();
		es.awaitTermination(10, TimeUnit.SECONDS);//wait till here
		System.out.println("====================");
		for(Future<String> fut:futureList) {
			System.out.println(fut.get());//print null in case of runnable
		}
		System.out.println("endTime:::"+new Date());
	}
}


