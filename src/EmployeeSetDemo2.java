import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo2 {
    public static void main(String[] args){
        Set<String> employeeNames = new HashSet<>();

        // Adding employee Names in the set
        employeeNames.add("Ali");
        employeeNames.add("Ahmed");
        employeeNames.add("Nasser");
        employeeNames.add("Sara");
        employeeNames.add("Noor");


        // Display all elements in the set
        System.out.println("Adding Employee Names: " + employeeNames);

        // adding one more employee name and displaying the set
        employeeNames.add("Kaild");
        System.out.println(employeeNames);


        // adding a duplicate employee names
        employeeNames.add("Nasser");
        //set after attempting to add duplicate
        System.out.println("After adding duplicate (Nasser): " + employeeNames);


        // Checking if a specific employee name exists
        System.out.println(employeeNames.contains("Sara"));

        // Remove an employee name
        System.out.println(employeeNames.remove("Nasser"));
        System.out.println(employeeNames);

        // Display total number of elements on the set
        System.out.println(employeeNames.size());

       //Add one new unique employee name
        employeeNames.add("Suliman");
        System.out.println(employeeNames);


        // Displaying the total number of elements on the set again
        System.out.println(employeeNames.size());

        // Clear all elements from the set
        employeeNames.clear();
        System.out.println(employeeNames);

        // Display set after clearing
        System.out.println(employeeNames.size());



    }

}
