package nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.*;

public class NashornDemo {
	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
		se.eval(new FileReader("demo.js"));
	}

}
