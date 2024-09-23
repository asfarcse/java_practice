package javaFeaureVersionWise.java9;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceEnhancement {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("java9.txt");
		try (fos) {
			fos.write("welcome to try with resource concept of java 9 ".getBytes());
			System.out.println("given string is written successfully in file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
