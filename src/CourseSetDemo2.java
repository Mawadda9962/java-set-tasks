import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo2 {

    public static void main(String[] args){
        Set<String> courseNames   = new HashSet<>();

        // Adding course names in java
        courseNames.add("Java Programming");
        courseNames.add("Electronics Engineering");
        courseNames.add("Data Structures");
        courseNames.add("Database Systems");
        courseNames.add("Cyber Security");

        //  all course names
        System.out.println("Course Names: " + courseNames);

        // Displaying set after attempting duplicate
        courseNames.add("Cyber Security");
        System.out.println("After adding duplicate (Cyber Security): " + courseNames);

        // Check if a course exists
        System.out.println(courseNames.contains("Electronics Engineering"));

        // Remove a course & Displaying the set after removing
        courseNames.remove("Data Structures");
        System.out.println(courseNames);

        // Display total number of courses
        System.out.println("Total number of courses: " + courseNames.size());

        // Clearing all courses & Displaying set after clearing
        courseNames.clear();
        System.out.println(courseNames);

        //Displaying the size of set after clearing
        System.out.println("The size of set after clearing: " + courseNames.size());

    }

}
