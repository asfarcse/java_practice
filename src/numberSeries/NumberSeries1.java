package numberSeries;

import java.util.*;

class NumberSeries1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int t=in.nextInt();
        int currentVal=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=0;j<n;j++) {
                if(j==0) {   
                	currentVal = a+b;
                	list1.add(a+b);
                } else {
                	int valToPush= currentVal*2+2;
                	list1.add(valToPush);
                	currentVal = valToPush;
                }
            }
            System.out.println(list1);
        }
        
        //addition
//        for(int i=0;i<n;i++) {
//            if(i==0) {   
//            	currentVal = a+b;
//            	list1.add(a+b);
//            } else {
//            	int valToPush= currentVal*2+2;
//            	list1.add(valToPush);
//            	currentVal = valToPush;
//            }
//        }
        
        //substraction
//        for(int i=0;i<n;i++) {
//            if(i==0) {   
//            	currentVal = a+b;
//            	list2.add(a+b);
//            } else {
//            	int valToPush= currentVal*2-2;
//            	list2.add(valToPush);
//            	currentVal = valToPush;
//            }
//        }
//        
//        System.out.println(list1);
//        System.out.println(list2);
        in.close();
    }
}
