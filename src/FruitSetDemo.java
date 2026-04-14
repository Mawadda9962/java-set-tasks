import java.util.HashSet;
import java.util.Set;

public class FruitSetDemo {
    public static void main(String[] args){

        Set<String> fruitNames = new HashSet<>();

        // Adding fruit names
        fruitNames.add("Apple");
        fruitNames.add("Banana");
        fruitNames.add("Mango");
        fruitNames.add("Orange");
        fruitNames.add("Grape");

        // all fruit names
        System.out.println("Fruit Names: " + fruitNames);

        // Adding a new fruit name
        fruitNames.add("Pineapple");
        System.out.println("After adding new fruit (Pineapple): " + fruitNames);

        // adding duplicate fruit name
        fruitNames.add("Apple");
        System.out.println("After adding duplicate (Apple): " + fruitNames);

        // Check if a fruit exists
        System.out.println("Contains Mango: " + fruitNames.contains("Mango"));

        // Check if another fruit does not exist
        System.out.println("Contains Strawberry: " + fruitNames.contains("Strawberry"));

        // Remove a fruit & display set after removing
        fruitNames.remove("Orange");
        System.out.println("After removing Orange: " + fruitNames);

        // Display total number of fruits
        System.out.println("Total number of fruits: " + fruitNames.size());

        // Adding a new fruit name
        fruitNames.add("Strawberry");
        System.out.println("After adding Strawberry: " + fruitNames);

        // Display total number after adding new fruit
        System.out.println("Total number of fruits: " + fruitNames.size());

        // Clearing all fruit names & displaying set after clearing
        fruitNames.clear();
        System.out.println("After clearing: " + fruitNames);

        // Displaying size after clearing
        System.out.println("The size of set after clearing: " + fruitNames.size());
    }
}

