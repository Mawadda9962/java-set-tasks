import java.util.HashSet;
import java.util.Set;

public class BookSetDemo {
    public static void main(String[] args){
        Set<String> bookTitles   = new HashSet<>();

        //Adding Book Titles
        bookTitles.add("The great City");
        bookTitles.add("Who Moved My Cheese?");
        bookTitles.add("Harry potter");
        bookTitles.add("The Little Prince");
        bookTitles.add("Peter Pan");

        // Display all Book Titles
        System.out.println("Book Titles: " + bookTitles);

        // Display set after attempting duplicate
        bookTitles.add("Peter Pan");
        System.out.println("Book Titles after attempting duplicate: " + bookTitles);

        // Check if a book exists
        System.out.println(bookTitles.contains("The great City"));

        // Remove a book & Displaying the set after removing
        System.out.println(bookTitles.remove("Harry potter"));
        System.out.println(bookTitles);

        // Displaying the size of set after removing
        System.out.println("Size after removing one book title: " + bookTitles.size());

        // Display set after clearing
        bookTitles.clear();
        System.out.println(bookTitles);

        // Displaying the size of set after clearing
        System.out.println("Size after clearing all elements: " + bookTitles.size());

    }
}
