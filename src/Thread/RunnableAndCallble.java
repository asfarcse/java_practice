package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableAndCallble {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Demo with Runnable
		System.out.println("Demo with Runnable:");
		Runnable runnableTask = () -> {
			System.out.println("Runnable task is running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Runnable task completed.");
		};

		Thread thread = new Thread(runnableTask);
		thread.start();

		// Wait for the thread to finish execution
		thread.join();

		// Demo with Callable
		System.out.println("\nDemo with Callable:");
		Callable<Integer> callableTask = () -> {
			System.out.println("Callable task is running...");
			Thread.sleep(2000); // Simulate some task execution time
			System.out.println("Callable task completed.");
			return 42; // Return a result
		};

		// Create an ExecutorService
		ExecutorService executor = Executors.newSingleThreadExecutor();

		// Submit the Callable task to the ExecutorService
		Future<Integer> future = executor.submit(callableTask);

		// Retrieve the result from the Future object
		int result = future.get();
		System.out.println("Result of the Callable task: " + result);

		// Shutdown the ExecutorService
		executor.shutdown();
	}

}
