import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 10, 4, 3, 20, 15));
        int k = 3;
        Collections.sort(list);
        System.out.println(k + "rd smallest element: " + list.get(k - 1));
    }
}
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java is fun and java is powerful";
        String[] words = text.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}
import java.util.*;

public class PQStackQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        System.out.println("Queue (Min-Priority): " + queue.poll());

        PriorityQueue<Integer> stack = new PriorityQueue<>(Collections.reverseOrder());
        stack.add(10);
        stack.add(20);
        System.out.println("Stack-like (Max-Priority): " + stack.poll());
    }
}
import java.util.*;

public class StudentMapping {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Rahim, Age: 20");
        students.put(102, "Karim, Age: 22");
        
        for (var entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Details: " + entry.getValue());
        }
    }
}
import java.util.*;

public class LinkedListCompare {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("A", "B", "C"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("A", "B", "C"));

        boolean isEqual = list1.equals(list2);
        System.out.println("Are LinkedLists equal? " + isEqual);
    }
}
import java.util.*;

public class EmployeeDept {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(501, "IT");
        employees.put(502, "HR");
        employees.put(503, "Finance");

        System.out.println(employees);
    }
}
