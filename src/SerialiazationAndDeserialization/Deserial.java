package SerialiazationAndDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserial {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ob.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student std = (Student)ois.readObject();
			std.printObject();
			fis.close();
			ois.close();
			System.out.println("De-serialization done...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
