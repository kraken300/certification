import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        // Enqueue Operation
        names.offer("JOHN");
        names.offer("ADAMS");
        names.offer("SMITH");
        names.offer("MIKE");
        names.offer("JACK");

        System.out.println(names);

        // Dequeue Operation
        System.out.println(names.poll());
        System.out.println(names);

        // View
        System.out.println(names.peek());
    }
}