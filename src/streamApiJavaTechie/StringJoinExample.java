package streamApiJavaTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringJoinExample {
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("mohd","asfar","indore","azamgarh");
		String result = String.join("-", strList);
		System.out.println("result::::::"+result);
	}

}
