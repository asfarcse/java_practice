package streamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseMap {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);
        originalMap.put("Four", 4);

        Map<Integer, String> reversedMap = originalMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        
        Map<Integer, String> collect = originalMap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println(collect);
        // Print the original map
        System.out.println("Original Map:");
        System.out.println(originalMap);

        // Print the reversed map
        System.out.println("Reversed Map:");
        System.out.println(reversedMap);
    }
}

