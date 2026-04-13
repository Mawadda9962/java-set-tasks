import java.util.HashSet;
import java.util.Set;

public class Task3 {

    public static void main(String[] args){
        Set<String> employeeIds = new HashSet<>();

        //Adding employee IDs
        employeeIds.add("A123");
        employeeIds.add("B123");
        employeeIds.add("C123");
        employeeIds.add("D123");

        //Display all elements
        System.out.println("Adding Employee IDs: ");
        System.out.println(employeeIds);

        //Check if an existing ID is present
        System.out.println(employeeIds.contains("A123"));

        //Check for non-existing ID
        System.out.println(employeeIds.contains("F123"));



    }
}
