import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hii {
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("HelloWorld".split(""));

		Map<String,Long> map = strList.stream()
				.filter(p->Collections.frequency(strList,p)>1)
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		
		for(Entry<String, Long> entry:map.entrySet()) {
			String key = entry.getKey();
			Long value = entry.getValue();
			findASCIIValue(key,value);
			
		}
		
	}

	private static void findASCIIValue(String key, Long value) {
		char[] charArray = key.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			char c = charArray[i];
			int c2 = --c;
			System.out.println((char)c2+" "+value);
			
		}
	}

}