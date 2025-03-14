import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {

        // Using ArrayDeque directly
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements to both ends
        arrayDeque.addFirst("First");
        arrayDeque.addFirst("New First");
        arrayDeque.addLast("Last");
        arrayDeque.addLast("New Last");

        System.out.println("ArrayDeque after adding elements : " + arrayDeque);

        // Removing elements from both ends
        System.out.println("Removed first element : " + arrayDeque.removeFirst());
        System.out.println("Removed last element : " + arrayDeque.removeLast());

        System.out.println("ArrayDeque after removing elements : " + arrayDeque);

        // View
        System.out.println("First element : " + arrayDeque.peekFirst());
        System.out.println("Last element : " + arrayDeque.peekLast());
    }
}