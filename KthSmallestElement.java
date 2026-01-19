import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 3, 5, 7, 19, 1));
        int k = 3; // Example: find 3rd smallest

        // Sorting the ArrayList in ascending order
        Collections.sort(numbers);

        // Accessing the (k-1)th index for the kth smallest element
        if (k > 0 && k <= numbers.size()) {
            System.out.println(k + "rd smallest element is: " + numbers.get(k - 1));
        } else {
            System.out.println("Invalid value of k");
        }
    }
}
