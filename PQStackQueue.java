import java.util.*;

public class PQStackQueue {
    public static void main(String[] args) {
        // Queue behavior: FIFO (First In First Out)
        // Note: PriorityQueue naturally sorts. To act like a simple Queue, 
        // we use a timestamp or insertion order (simplified here with a sequence).
        PriorityQueue<Integer> queue = new PriorityQueue<>(); 
        queue.add(10); queue.add(20);
        System.out.println("Queue (Poll): " + queue.poll());

        // Stack behavior: LIFO (Last In First Out) using Reverse Order Comparator
        PriorityQueue<Integer> stack = new PriorityQueue<>(Collections.reverseOrder());
        stack.add(10); stack.add(50); stack.add(30);
        System.out.println("Stack (Poll/Top): " + stack.poll()); // Returns 50
    }
}
