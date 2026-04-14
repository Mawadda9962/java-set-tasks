import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {
    public static void main(String[] args){
        Set<String>  carNames  = new HashSet<>();

        // Adding car names
        carNames.add("Toyota");
        carNames.add("Honda");
        carNames.add("BMW");
        carNames.add("Audi");
        carNames.add("Nissan");

        //  all car names
        System.out.println("subject Names: " + carNames);

        //Adding a new car name
        System.out.println("bio");
        System.out.println(carNames);

        // Displaying set after attempting duplicate
        carNames.add("ford");
        System.out.println("After adding duplicate (ford): " + carNames);

        // Check if a car exists
        System.out.println(carNames.contains("BMW"));

        // Check if a another course exists
        System.out.println(carNames.contains("charger"));

        // Remove a car & Displaying the set after removing
        carNames.remove("Nissan");
        System.out.println(carNames);

        // Display total number of car
        System.out.println("Total number of car: " + carNames.size());

        //Adding a new car name
        carNames.add("Mostang");
        System.out.println(carNames);

        // Display total number of car names after adding a new car
        System.out.println("Total number of car: " + carNames.size());

        // Clearing all car names & Displaying set after clearing
        carNames.clear();
        System.out.println(carNames);

        //Displaying the size of set after clearing
        System.out.println("The size of set after clearing: " + carNames.size());

    }

}




