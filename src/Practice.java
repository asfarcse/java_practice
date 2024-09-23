import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


//count,sum,avarage,sq,highest,minimum,2nd high,2nd min;
class Practice {
    public static void main(String[] args) {
    	List<Integer> list = List.of(1,2,3,4,5,6);
    	int[] arr = {1,2,3,4,5,6};
    	
    	/**sum with Integer class*/
    	Integer sum = list.stream().reduce((a,b)->a+b).get();
    	System.out.println("sum is:::"+sum);
    	
    	/**sum with int data type*/
    	int sum2 = Arrays.stream(arr).boxed().reduce((a,b)->a+b).get();
    	System.out.println("sum2 is:::"+sum2);
    	
    	/**sum with int data type*/
    	int sum3 = Arrays.stream(arr).mapToObj(p->p).reduce((a,b)-> a+b).get();
    	System.out.println("sum3 is:::"+sum3);
    }
}
