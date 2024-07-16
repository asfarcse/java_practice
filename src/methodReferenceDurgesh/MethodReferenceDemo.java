package methodReferenceDurgesh;

public class MethodReferenceDemo {
	public static void main(String[] args) {
		System.out.println("Method Reference......");
		
		//provide the implementation of workInterface
		WorkInterface workInterface = ()->{
			System.out.println("this is do task new method...");
		};
		workInterface.doTask();
		
		System.out.println("----------------------------------------");
		//refer static method of stuff class using ::
		WorkInterface workInterface1 = Stuff::doStuff;
		workInterface1.doTask();
		
		System.out.println("----------------------------------------");
		//refer static method of stuff class using  ::
		Runnable runnable1 = Stuff::printEvenNumber;
		Thread t1 = new Thread(runnable1);
		t1.start();
		
		System.out.println("----------------------------------------");
		//refer non-static method of stuff class using object along with ::
		Stuff ob = new Stuff();
		Runnable runnable2 = ob::printNumber;
		Thread t2 = new Thread(runnable2);
		t2.start();
		
		System.out.println("--------------CONSTRUCTOR_REFERENCE_DEMO--------------------------");
		//constructor reference
		StudentInterface studentInterface = StudentClass::new;
		StudentClass student = studentInterface.getStudent("asfar");
		student.display();

		
	}
}
