import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args){
        Set<String> product = new HashSet<>();
        product.add("OP11");
        product.add("OP22");
        product.add("OP33");
        product.add("OP44");

        System.out.println("Product codes: ");
        System.out.println(product);

        product.add("0P55");

        System.out.println("After Adding one more code: ");
        System.out.println(product);



    }
}
