package leetcode;

//Find the Index of the First Occurrence in a String
public class Problem28 {
	public static void main(String[] args) {
		String haystack = "abc";
		String needle = "c";
		Integer index = findStartingIndex(haystack,needle);
		System.out.println("starting index is:::"+index);
	}

	private static Integer findStartingIndex(String haystack, String needle) {
		if(haystack.equalsIgnoreCase(needle)) {
			return 0;
		} else {
			int i=0,j=needle.length();
			Boolean flag = false;
			while(!flag && i<=haystack.length() && j<=haystack.length()) {
				String subStr = getSubString(i,j,haystack); //haystack.substring(i,j);
				if(needle.equalsIgnoreCase(subStr)) {
					flag=true;
					return i;
				} else {
					i++;
					j++;
				}
			}
			return -1;
		}
	}
	
	public static String getSubString(int i,int j,String str) {
		StringBuilder sb = new StringBuilder();
		for(int i1=i;i1<j;i1++) {
			sb.append(str.charAt(i1));
		}
		return sb.toString();
	}
}
