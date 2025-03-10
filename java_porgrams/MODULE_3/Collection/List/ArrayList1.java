import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        // Creating arraylist
        ArrayList list = new ArrayList();

        // Add elemets to a list
        list.add(10);
        list.add("hello");
        list.add(true);
        list.add(50.258);
        list.add('a');
        list.add(new ArrayList1());

        // Print list
        System.out.println("\n" + list + "\n");

        // Remove an object
        list.remove(50.258);

        // After removal
        System.out.println("\n" + list + "\n");
    }
}