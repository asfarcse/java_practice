package leetcode;

public class Problem7 {
	public static void main(String[] args) {
		Problem7 obj = new Problem7();
		System.out.println(obj.reverse(-231));
//		obj.reverse(231);
	}
	
	private int reverse(int x) {
	    if (x == 0) {
	        return 0;
	    } else {
	        boolean isNegative = x < 0;
	        x = Math.abs(x);
	        long reversed = 0;
	        while (x > 0) {
	            reversed = reversed * 10 + x % 10;
	            x /= 10;
	        }
	        if (reversed > Integer.MAX_VALUE) {
	            return 0; // Overflow occurred
	        }
	        return isNegative ? (int) (-reversed) : (int) reversed;
	    }
	}


//	private int reverse(int x) {
//		if(x == 0) {
//			return 0;
//		}
//		else {
//			String num = "";
//			if(x > 0) {
//				while(x>0) {
//					num+=x%10;
//					x = x/10;
//				}
//				return Integer.parseInt(num);
//			} else {
//				while(x>0) {
//					num+=x%10;
//					x = x/10;
//				}
//				return Integer.parseInt("-"+num);
//			}
//	}
//}
}
