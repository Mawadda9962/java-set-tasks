import java.util.HashSet;
import java.util.Set;

public class RemoveSetDemo {
    public static void main(String[] args){

        //Create a set using HashSet
        Set<String> productNames = new HashSet<>();

        //Adding product name
        productNames.add("Laptop");
        productNames.add("Mouse");
        productNames.add("Keyboard");
        productNames.add("Printer");

        //Display set before removal
        System.out.println("Products before removal: ");
        System.out.println(productNames);

        //removing an element from the set
        System.out.println(productNames.remove("Laptop"));

        //show removal result
        System.out.println(productNames);


    }

}
