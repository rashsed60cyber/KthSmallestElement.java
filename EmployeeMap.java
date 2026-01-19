import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeDept = new HashMap<>();
        employeeDept.put(1001, "IT Department");
        employeeDept.put(1002, "HR Department");
        employeeDept.put(1003, "Finance");

        System.out.println("Employee 1001 works in: " + employeeDept.get(1001));
        System.out.println("All Records: " + employeeDept);
    }
}
