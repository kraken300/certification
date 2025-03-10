import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> f_itr = list.listIterator();
        ListIterator<Integer> b_itr = list.listIterator(list.size());

        System.out.println("Forward");
        while (f_itr.hasNext()) {
            System.out.println(f_itr.next());
        }

        System.out.println();

        System.out.println("Backward");
        while (b_itr.hasPrevious()) {
            System.out.println(b_itr.previous());
        }
    }
}
