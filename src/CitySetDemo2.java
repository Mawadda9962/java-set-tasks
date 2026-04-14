import java.util.HashSet;
import java.util.Set;

public class CitySetDemo2 {
    public static void main(String[] args){
        Set<String> cityNames  = new HashSet<>();

        // Adding city names
        cityNames.add("Muscat");
        cityNames.add("Dubai");
        cityNames.add("London");
        cityNames.add("Paris");
        cityNames.add("Tokyo");

        // Display all city names
        System.out.println("City Names: " + cityNames);

        // Displaying all city names after adding one more city name
        cityNames.add("Salalah");
        System.out.println("City Names after adding one more: "+ cityNames);

        // Display set after attempting duplicate
        cityNames.add("Tokyo");
        System.out.println("City Names after attempting duplicate: " + cityNames);

        // Check if a city exists
        System.out.println(cityNames.contains("Dubai"));
        System.out.println(cityNames);

        // Remove a city
        System.out.println(cityNames.remove("Paris"));
        System.out.println(cityNames);

        // Display total number of cities
        System.out.println("Total number of cities: " + cityNames.size());

        // Adding one more city name & Displaying the total number of cities
        cityNames.add("sohar");
        System.out.println("Total number of cities after adding one more city name: " + cityNames.size());

        // Display set after clearing
        cityNames.clear();
        System.out.println("After clearing the set: " + cityNames);

        // Confirm set is empty
        System.out.println("Size after clearing: " + cityNames.size());



    }


}
