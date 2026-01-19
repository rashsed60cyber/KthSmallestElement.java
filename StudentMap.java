import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> studentDetails = new TreeMap<>();
        studentDetails.put(101, "Rahim - Dhaka");
        studentDetails.put(105, "Karim - Sylhet");
        studentDetails.put(102, "Abir - Chittagong");

        // TreeMap automatically sorts by Student ID
        for (Map.Entry<Integer, String> entry : studentDetails.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Info: " + entry.getValue());
        }
    }
}
