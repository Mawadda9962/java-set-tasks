import java.util.HashSet;
import java.util.Set;

public class CitySetDemo {
    public static void main(String[] args){
        Set<String>  cityNames  = new HashSet<>();

        // Adding city names
        cityNames.add("Muscat");
        cityNames.add("Dubai");
        cityNames.add("London");
        cityNames.add("Paris");
        cityNames.add("Tokyo");

        // Display all city names
        System.out.println("City Names: " + cityNames);

        // Display set after attempting duplicate
        cityNames.add("Tokyo");
        System.out.println("City Names after attempting duplicate: " + cityNames);

        // Check if a city exists
        System.out.println(cityNames.contains("Dubai"));

        // Remove a city
        System.out.println(cityNames.remove("Paris"));
        System.out.println(cityNames);

        // Display total number of cities
        System.out.println("Total number of cities: " + cityNames.size());

        // Display set after clearing
        cityNames.clear();
        System.out.println("After clearing the set: " + cityNames);

        // Confirm set is empty
        System.out.println("Size after clearing: " + cityNames.size());







    }

}