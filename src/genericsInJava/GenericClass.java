package genericsInJava;

class Test<T> {
	
	T obj;
	
	public Test(T obj) {
		this.obj = obj;
	}
	
	public T getObject () {
		return this.obj;
	}
}

public class GenericClass {
	public static void main(String[] args) {
		Test<Integer> iObj = new Test<>(14);
		System.out.println(iObj.getObject());
		System.out.println("class Type:::"+iObj.getObject().getClass());
		
		Test<String> sObj = new Test<>("asfar");
		System.out.println(sObj.getObject());
		System.out.println("class Type:::"+sObj.getObject().getClass());
	}
}
