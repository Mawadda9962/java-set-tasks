import java.util.HashSet;
import java.util.Set;

public class MovieSetDemo {
    public static void main(String[] args){

        Set<String> movieNames = new HashSet<>();

        //Adding movie Names
        movieNames.add("Frozen");
        movieNames.add("Titanic");
        movieNames.add("Avatar");
        movieNames.add("The Lion King");
        movieNames.add("Harry Potter");


        // Display all movie Names
        System.out.println("City Names: " + movieNames);


        // Display set after attempting duplicate
        movieNames.add("Harry Potter");
        System.out.println("movie Names after attempting duplicate: " + movieNames);

        // Check if a movie Names
        System.out.println(movieNames.contains("Avatar"));

        // Remove a movie Name & Displaying the set after removing
        System.out.println(movieNames.remove("Harry potter"));
        System.out.println(movieNames);

        // Displaying the size of set after removing
        System.out.println("Size after removing one movie Name: " + movieNames.size());

        // Display set after clearing
        movieNames.clear();
        System.out.println(movieNames);

        // Displaying the size of set after clearing
        System.out.println("Size after clearing all elements: " + movieNames.size());


    }
}
