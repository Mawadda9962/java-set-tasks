import java.util.HashSet;
import java.util.Set;

public class CountrySetDemo {
    public static void main(String[] args){
        Set<String> countryNames  = new HashSet<>();

        // Adding country names
        countryNames.add("Oman");
        countryNames.add("UAE");
        countryNames.add("Saudi Arabia");
        countryNames.add("Qatar");
        countryNames.add("Bahrain");

        //  all country names
        System.out.println("country Names: " + countryNames);

        //Adding a new country name
        System.out.println("Qatar");
        System.out.println(countryNames);

        // Displaying set after attempting duplicate
        countryNames.add("ford");
        System.out.println("After adding duplicate (ford): " + countryNames);

        // Check if a country exists
        System.out.println(countryNames.contains("Bahrain"));

        // Check if a another country dose not exists
        System.out.println(countryNames.contains("India"));

        // Remove a country & Displaying the set after removing
        countryNames.remove("UAE");
        System.out.println(countryNames);

        // Display total number of country
        System.out.println("Total number of country: " + countryNames.size());

        //Adding a new country name
        countryNames.add("France");
        System.out.println(countryNames);

        // Display total number of country names after adding a new country
        System.out.println("Total number of country: " + countryNames.size());

        // Clearing all country names & Displaying set after clearing
        countryNames.clear();
        System.out.println(countryNames);

        //Displaying the size of set after clearing
        System.out.println("The size of set after clearing: " + countryNames.size());

    }

}






