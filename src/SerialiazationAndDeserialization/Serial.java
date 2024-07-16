package SerialiazationAndDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String[] args) {
		try {
			Student student = new Student(1, "asfar","asfarcse@gmail.com", "indore");
			FileOutputStream fos = new FileOutputStream("ob.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			
			oos.close();
			fos.close();
			System.out.println("serialization done...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
