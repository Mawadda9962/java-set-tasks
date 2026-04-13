import java.util.HashSet;
import java.util.Set;

public class Task2 {

    public static void main(String[] args){
        Set<String> customerIds = new HashSet<>();

        customerIds.add("1122");
        customerIds.add("3344");
        customerIds.add("5566");
        customerIds.add("7788");

        System.out.println("Adding Customer IDs: ");
        System.out.println(customerIds);

        customerIds.add("3344");

        System.out.println("After Adding Another Customer ID: ");
        System.out.println(customerIds);
    }
}
