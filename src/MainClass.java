import java.util.HashMap;
import java.util.Map;

interface Utill {
	static String checkNull(Object obj) {
		if(obj!=null) {
			return "not null";
		} else {
			return "null";
		}
	}
}

class MainClass{
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "101");
		map.put(102, "102");
		map.put(103, null);
		map.put(104, null);
		map.put(null, null);
		map.put(null, null);
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println("key "+entry.getKey()+" value "+entry.getValue());
		}
	}
}