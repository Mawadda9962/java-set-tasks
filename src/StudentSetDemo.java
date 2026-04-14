import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {
    public static void main(String[] args){
        Set<String> studentNames = new HashSet<>();

        // Add student names to set
        studentNames.add("Ahmed");
        studentNames.add("Mawadda");
        studentNames.add("jenan");
        studentNames.add("Jehad");
        studentNames.add("Suliman");

        // Displaying all student names
        System.out.println("Adding student Names: " + studentNames);
        // Adding a duplicate name
        studentNames.add("Mawadda");
        // Display set after attempting duplicate
        System.out.println("After adding duplicate (Mawadda): " + studentNames);
        // Check if a student exists
        System.out.println(studentNames.contains("Ahmed"));
        // Remove a student name
        System.out.println(studentNames.remove("Mawadda"));
        System.out.println(studentNames);

        // Display total number of students
        System.out.println("Total number of students: " + studentNames.size());

        // Displaying set after clearing
        studentNames.clear();
        System.out.println("After clearing the set: " + studentNames);

        System.out.println("Total number of students after clearing: " + studentNames.size());









    }

}