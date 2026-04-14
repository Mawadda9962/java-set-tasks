import java.util.HashSet;
import java.util.Set;

public class FlowerSetDemo {
    public static void main(String[] args){

        Set<String> flowerNames = new HashSet<>();

        // Adding flower names
        flowerNames.add("Rose");
        flowerNames.add("Lily");
        flowerNames.add("Tulip");
        flowerNames.add("Sunflower");
        flowerNames.add("Jasmine");

        // all flower names
        System.out.println("Flower Names: " + flowerNames);

        // Adding a new flower name
        flowerNames.add("Daisy");
        System.out.println("After adding new flower (Daisy): " + flowerNames);

        // adding duplicate flower name
        flowerNames.add("Rose");
        System.out.println("After adding duplicate (Rose): " + flowerNames);

        // Check if a flower exists
        System.out.println("Contains Tulip: " + flowerNames.contains("Tulip"));

        // Check if another flower does not exist
        System.out.println("Contains Lotus: " + flowerNames.contains("Lotus"));

        // Remove a flower & display set after removing
        flowerNames.remove("Sunflower");
        System.out.println("After removing Sunflower: " + flowerNames);

        // Display total number of flowers
        System.out.println("Total number of flowers: " + flowerNames.size());

        // Adding a new flower name
        flowerNames.add("Lotus");
        System.out.println("After adding Lotus: " + flowerNames);

        // Display total number after adding new flower
        System.out.println("Total number of flowers: " + flowerNames.size());

        // Clearing all flower names & displaying set after clearing
        flowerNames.clear();
        System.out.println("After clearing: " + flowerNames);

        // Displaying size after clearing
        System.out.println("The size of set after clearing: " + flowerNames.size());
        System.out.println("The set now contains zero elements.");
    }
}