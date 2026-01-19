import java.util.*;

public class LinkedListEquality {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("A", "B", "C"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("A", "B", "C"));

        // The equals() method in LinkedList checks for size and content order
        boolean isEqual = list1.equals(list2);
        System.out.println("Are LinkedLists equal? " + isEqual);
    }
}
