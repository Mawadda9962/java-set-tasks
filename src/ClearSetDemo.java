import java.util.HashSet;
import java.util.Set;

public class ClearSetDemo {
    public static void main(String[] args){
        Set<String> userName = new HashSet<>();

      // Adding user names to the set
        userName.add("Mawadda");
        userName.add("Salim");
        userName.add("Ahmed");
        userName.add("Sara");

       // Displaying all the elements in the set before clearing
        System.out.println("Username before cleaning");
        System.out.println(userName);

        // Displaying the size of the set
        System.out.println(userName.size());

        // removeing all elements from the set
        userName.clear();

        //Displaying the set after clearing
        System.out.println("Username after cleaning");
        System.out.println(userName);

        //displaying the number of elements after clearing
        System.out.println(userName.size());



    }

    }
