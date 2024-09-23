package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;

public class CheckedException {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("example.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
