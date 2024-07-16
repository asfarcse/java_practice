package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("asfar", 700);
		map.put("adil", 600);
		map.put("kashif", 400);
		map.put("afaque", 200);
		
		System.out.println(map);
		System.out.println(map.put("asfar", 1000));
		
		Set<String> s = map.keySet();
		System.out.println(s);
		Collection<Integer> c = map.values();
		System.out.println(c);
		
		Set<Entry<String,Integer>> s1 = map.entrySet();
		System.out.println(s1);
		
		Iterator<Entry<String,Integer>> itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry<String,Integer> m1 = (Map.Entry<String,Integer>) itr.next();
			System.out.println(m1.getKey()+"------>"+m1.getValue());
			if(m1.getKey().equals("asfar")) {
				m1.setValue(999);
			}
		}
		System.out.println(map);
	}
}
