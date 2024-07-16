package stringExample;

public class ImmutableExample {
	public static void main(String[] args) {
		String str = "asfar";
		String str2 = str;
		str2="abc";
		str2="xyz";
		System.out.println(str);
		System.out.println(str2);
	}
}
