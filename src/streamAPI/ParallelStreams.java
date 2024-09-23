package streamAPI;

import java.util.Arrays;
import java.util.List;

/**use ParallelStreams when data is not dependent on each other*/
public class ParallelStreams {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("asfar","mohd","demo","delhi","azamgarh");
		list.parallelStream().filter(p->p.startsWith("a")).forEach(System.out::println);
	}
}
