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
    }
}

