import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {
    public static void main(String[] args){
        Set<String> employeeIds = new HashSet<>();

        // Adding employee IDs in the set
        employeeIds.add("A123");
        employeeIds.add("B123");
        employeeIds.add("C123");
        employeeIds.add("D123");
        employeeIds.add("F123");


        // Display all elements in the set
        System.out.println("Adding Employee IDs: " + employeeIds);
        // adding a duplicate employee ID
        employeeIds.add("A123");
        //set after attempting to add duplicate
        System.out.println("After adding duplicate (A123): " + employeeIds);
        // Checking if a specific employee ID exists
        System.out.println(employeeIds.contains("F123"));

        // Remove an employee ID
        System.out.println(employeeIds.remove("F123"));
        System.out.println(employeeIds);

        // Display total number of elements
        System.out.println(employeeIds.size());

        // Clear all elements from the set
        employeeIds.clear();
        System.out.println(employeeIds);

        // Display set after clearing
        System.out.println(employeeIds.size());



    }
}