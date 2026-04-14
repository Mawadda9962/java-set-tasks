import java.util.HashSet;
import java.util.Set;

public class AnimalSetDemo {
    public static void main(String[] args){

        Set<String> animalNames = new HashSet<>();

        // Adding animal names
        animalNames.add("Lion");
        animalNames.add("Tiger");
        animalNames.add("Elephant");
        animalNames.add("Giraffe");
        animalNames.add("Zebra");

        // all animal names
        System.out.println("Animal Names: " + animalNames);

        // Adding a new animal name
        animalNames.add("Leopard");
        System.out.println("After adding new animal (Leopard): " + animalNames);

        // Adding duplicate animal name
        animalNames.add("Lion");
        System.out.println("After adding duplicate (Lion): " + animalNames);

        // Check if an animal exists
        System.out.println("Contains Tiger: " + animalNames.contains("Tiger"));

        // Check if another animal does not exist
        System.out.println("Contains Bear: " + animalNames.contains("Bear"));

        // Remove an animal & display set after removing
        animalNames.remove("Giraffe");
        System.out.println("After removing Giraffe: " + animalNames);

        // Display total number of animals
        System.out.println("Total number of animals: " + animalNames.size());

        // Adding a new animal name
        animalNames.add("Panda");
        System.out.println("After adding Panda: " + animalNames);

        // Display total number after adding new animal
        System.out.println("Total number of animals: " + animalNames.size());

        // Clearing all animal names & displaying set after clearing
        animalNames.clear();
        System.out.println("After clearing: " + animalNames);

        // Displaying size after clearing
        System.out.println("The size of set after clearing: " + animalNames.size());
    }
}