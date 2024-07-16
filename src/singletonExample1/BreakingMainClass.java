package singletonExample1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class BreakingMainClass {
	public static void main(String[] args) throws Exception {
		
		/***reflection method**/
//		BreakingExampleClass obj1 = BreakingExampleClass.getInstance();
//		System.out.println(obj1.hashCode());
//		
//		Constructor<BreakingExampleClass> constructor = BreakingExampleClass.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		BreakingExampleClass obj2 = constructor.newInstance();
//		System.out.println(obj2.hashCode());
		
		/**serialization method start*/
		BreakingExampleClass object = BreakingExampleClass.getInstance();
		System.out.println(object.hashCode());
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		oos.writeObject(object);
		
		System.out.println("Serialization done......");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
		BreakingExampleClass readObject = (BreakingExampleClass)ois.readObject();
		System.out.println(readObject.hashCode());
		
		/**serialization method end*/
	}
}
