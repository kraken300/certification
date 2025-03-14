import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {
    public static void main(String[] args) {

        // Using the Deque interface with ArrayDeque as the implementation
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to both ends
        deque.addFirst("First");
        deque.addFirst("New First");
        deque.addLast("Last");
        deque.addLast("New Last");

        System.out.println("Deque after adding elements : " + deque);

        // Removing elements from both ends
        System.out.println("Removed first element : " + deque.removeFirst());
        System.out.println("Removed last element : " + deque.removeLast());

        System.out.println("Deque after removing elements : " + deque);

        // View
        System.out.println("First element : " + deque.peekFirst());
        System.out.println("Last element : " + deque.peekLast());
    }
}