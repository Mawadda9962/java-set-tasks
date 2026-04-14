import java.util.HashSet;
import java.util.Set;

public class WebsiteSetDemo {
    public static void main(String[] args){

        Set<String> websiteNames = new HashSet<>();

        //Adding Website Names
        websiteNames.add("Google");
        websiteNames.add("Amazon");
        websiteNames.add("Yahoo");
        websiteNames.add("Wikipedia");
        websiteNames.add("YouTube");


        // Display all Website Names
        System.out.println("Website Names: " + websiteNames);


        // Display set after attempting duplicate
        websiteNames.add("Wikipedia");
        System.out.println("Website Names after attempting duplicate: " + websiteNames);

        // Check if a Website Names is on the set
        System.out.println(websiteNames.contains("YouTube"));

        // Remove a Website Name & Displaying the set after removing
        System.out.println(websiteNames.remove("Yahoo"));
        System.out.println(websiteNames);

        // Displaying the size of set after removing
        System.out.println("Size after removing one Website Name: " + websiteNames.size());

        // Display set after clearing
        websiteNames.clear();
        System.out.println(websiteNames);

        // Displaying the size of set after clearing
        System.out.println("Size after clearing all elements: " + websiteNames.size());


    }


}
