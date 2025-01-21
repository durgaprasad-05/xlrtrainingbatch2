import java.util.HashSet;

public class Demo032 {
    public static void main(String[] args) {
        // Create a HashSet to store homogeneous string values
        HashSet<String> stringSet = new HashSet<>();

        // Add string values to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Grapes");

        // Display the elements in the HashSet
        System.out.println("Elements in the HashSet: " + stringSet);
    }
}