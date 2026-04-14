import java.util.HashSet;
import java.util.Set;

public class SubjectSetDemo {

    public static void main(String[] args){
        Set<String>  subjectName  = new HashSet<>();

        // Adding course names in java
        subjectName.add("Math");
        subjectName.add("Science");
        subjectName.add("English");
        subjectName.add("History");
        subjectName.add("Computer");

        //  all subject names
        System.out.println("subject Names: " + subjectName);

        //Adding a new subject name
        System.out.println("bio");
        System.out.println(subjectName);

        // Displaying set after attempting duplicate
        subjectName.add("Bio");
        System.out.println("After adding duplicate (Bio): " + subjectName);

        // Check if a course exists
        System.out.println(subjectName.contains("History"));

        // Check if a another course exists
        System.out.println(subjectName.contains("Music"));

        // Remove a course & Displaying the set after removing
        subjectName.remove("History");
        System.out.println(subjectName);

        // Display total number of subjects
        System.out.println("Total number of subjects: " + subjectName.size());

        //Adding a new subject name
        subjectName.add("Chemistry");
        System.out.println(subjectName);

        // Display total number of subjects after adding a new subject
        System.out.println("Total number of subjects: " + subjectName.size());

        // Clearing all courses & Displaying set after clearing
        subjectName.clear();
        System.out.println(subjectName);

        //Displaying the size of set after clearing
        System.out.println("The size of set after clearing: " + subjectName.size());

    }

}
