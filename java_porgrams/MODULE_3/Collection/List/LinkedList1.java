import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(50);
        list.add(66);
        list.add(78);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(list);

        list2.add(100);
        list2.add(200);
        System.out.println(list2);
    }
}
