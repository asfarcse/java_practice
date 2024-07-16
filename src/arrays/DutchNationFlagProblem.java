package arrays;

public class DutchNationFlagProblem {
	public static void main(String[] args) {
		Integer[] numArray = {0,1,2,0,1,2,0,2,0,0,2,1,1,1};
		Integer count0=0,count1=0,count2=0;
		for(Integer num:numArray) {
			if(num==0) {
				count0++;
			} else if (num==1) {
				count1++;
			} else if (num==2) {
				count2++;
			} else {
				break;
			}
		}
		
		for(int i=0;i<=count0-1;i++) {
			numArray[i] = 0;
		}
		
		for(int i=count0;i<=(count0+count1)-1;i++) {
			numArray[i] = 1;
		}
		
		for(int i=count0+count1;i<=(count0+count1+count2)-1;i++) {
			numArray[i] = 2;
		}
		
		for(Integer arr:numArray) {
			System.out.print(arr);
		}
	}
}
