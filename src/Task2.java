import java.util.HashSet;
import java.util.Set;

public class Task2 {

    public static void main(String[] args){
        Set<String> customerIds = new HashSet<>();

        //Adding customer IDs
        customerIds.add("1122");
        customerIds.add("3344");
        customerIds.add("5566");
        customerIds.add("7788");

        //Display the element of the set
        System.out.println("Adding Customer IDs: ");
        System.out.println(customerIds);

        //Adding a new customer ID
        customerIds.add("3344");

        //Printing all the customer IDs after adding
        System.out.println("After Adding Another Customer ID: ");
        System.out.println(customerIds);
    }
}
