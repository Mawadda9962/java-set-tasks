import java.util.HashSet;
import java.util.Set;

public class SizeSetDemo {
    public static void main(String[] args){

        //Create a set using HashSet
        Set<String> departmentSet = new HashSet<>();

        //Adding Department name
        departmentSet.add("HR");
        departmentSet.add("Finance");
        departmentSet.add("IT");
        departmentSet.add("Operation");

        //Display set
        System.out.println("Product Names: ");
        System.out.println(departmentSet);

        //Display the size of set
        System.out.println(departmentSet.size());

        //Display the size of set after adding one department
        departmentSet.add("Marketing");
        System.out.println(departmentSet.size());


    }

    }
