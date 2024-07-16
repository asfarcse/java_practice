package cursorsInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        ListIterator<String> iterator = fruits.listIterator();

        // Forward traversal
        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            int index = iterator.nextIndex(); // Get index of next element
            String fruit = iterator.next();
            System.out.println("Index: " + index + ", Fruit: " + fruit);
        }

        // Backward traversal
        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            int index = iterator.previousIndex(); // Get index of previous element
            String fruit = iterator.previous();
            System.out.println("Index: " + index + ", Fruit: " + fruit);
        }

        // Adding elements at the beginning
        iterator.add("Grapes");
        iterator.add("Pineapple");

        // Modifying elements
        iterator.next(); // Move to the next element after insertion
        iterator.set("Kiwi");

        // Removing elements
        iterator.previous(); // Move to the previous element
        iterator.remove();

        // Displaying modified list
        System.out.println("\nModified List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

