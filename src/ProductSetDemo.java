import java.util.HashSet;
import java.util.Set;

public class ProductSetDemo {
    public static void main(String[] args){
        Set<String> productNames = new HashSet<>();

        //Adding Product Names
        productNames.add("iPhone 15 Pro");
        productNames.add("Samsung Galaxy");
        productNames.add("MacBook");
        productNames.add("PlayStation");
        productNames.add("Xbox");

        // Display all Product Names
        System.out.println("Product Names: " + productNames);

        // Display set after attempting duplicate
        productNames.add("Xbox ");
        System.out.println(productNames);

        // Check if a product Name is on the set
        System.out.println(productNames.contains("MacBook"));

        // Remove a product Name & Displaying the set after removing
        System.out.println(productNames.remove("Samsung Galaxy"));
        System.out.println(productNames);

        // Displaying the size of set after removing
        System.out.println("Size after removing one product Name: " + productNames.size());

        // Display set after clearing
        productNames.clear();
        System.out.println(productNames);

        // Displaying the size of set after clearing
        System.out.println("Size after clearing all elements: " + productNames.size());



    }
}
