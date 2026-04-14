import java.util.HashSet;
import java.util.Set;

public class mobileAppNames {
    public static void main(String[] args){
        Set<String> mobileAppNames  = new HashSet<>();

        // Adding mobile app names
        mobileAppNames.add("WhatsApp");
        mobileAppNames.add("Instagram");
        mobileAppNames.add("TikTok");
        mobileAppNames.add("Facebook");
        mobileAppNames.add("Snapchat");

        // Displaying all app names
        System.out.println("Adding mobileAppNames " + mobileAppNames);

        // Display set after attempting duplicate
        mobileAppNames.add("Snapchat");
        System.out.println("Adding mobileApp Names after duplicating " + mobileAppNames);

        // Check if a mobile App Names exists
        System.out.println(mobileAppNames.contains("Snapchat"));

        // Remove mobile App Names & Displaying the set after removing
        System.out.println(mobileAppNames.remove("Facebook"));
        System.out.println(mobileAppNames);

        // Display total number of mobile App Names
        System.out.println("Total number of mobile App Names: " + mobileAppNames.size());

        // Display set after clearing
        mobileAppNames.clear();
        System.out.println(mobileAppNames);

        //Displaying the size of set after clearing
        System.out.println("The size of set: " + mobileAppNames.size());

    }

}
