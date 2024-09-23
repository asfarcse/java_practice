package collectionexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge2List {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        List<String> list2 = new ArrayList<>();
        list2.add("X");
        list2.add("Y");
        list2.add("Z");
        
        List<String> list3 = new ArrayList<>();
        list3.add("XXX");
        list3.add("xxfsfs");
        list3.add("Vvdvd");
        
        List<String> collect = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(collect);
//        List<String> mergedList = Stream.concat(list1.stream(), list2.stream(),list3.stream()).collect(Collectors.toList());
//        List<String> mergedList1 = Stream.concat(Stream.concat(list1.stream(), list2.stream()), list3.stream())
//                .collect(Collectors.toList());

        // Display the merged list
//        System.out.println("Merged List: " + mergedList1);
        
        int[] arr1 = {2,5,6,8};
        int[] arr2 = {1,3,4,5,6};
        
        int i=0;
        int j=0;
        List<Integer> list = new ArrayList<>();
        while(i<arr1.length && j<arr2.length) {
        	if(arr1[i] < arr2[j]) {
        		list.add(arr1[i++]);
        	} else if(arr1[i] > arr2[j]) {
        		list.add(arr2[j++]);
        	} else {
        		list.add(arr1[i]);
        		i++;
        		j++;
        	}
        }
        
        if(i<arr1.length) {
        	while(i<arr1.length) {
        		list.add(arr1[i++]);
        	}
        }
        
        if(j<arr2.length) {
        	while(j<arr2.length) {
        		list.add(arr2[j++]);
        	}
        }
        
        System.out.println("list:::::"+list);
    }
}

