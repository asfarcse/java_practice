package oopsConcept;


/**achieved using overloading concept*/
public class CompileTimeOrStaticPolymorphism {
	public static void main(String[] args) {
		CompileTimeOrStaticPolymorphism obj = new CompileTimeOrStaticPolymorphism();
		System.out.println(obj.add(2, 3,3));
	}
	
	public int add (int a,int b,int c) {
		System.out.println("add with 3 args invoked");
		return a+b+c;
	}
	
	public int add (int a,int b) {
		System.out.println("add with 2 args invoked");
		return a+b;
	}
}
