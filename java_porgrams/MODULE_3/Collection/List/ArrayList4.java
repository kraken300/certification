import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // for (Integer integer : list) {
        // // Exception in thread "main" java.util.ConcurrentModificationException
        // list.remove(list.indexOf(integer));
        // }

        // System.out.println(list);

        Iterator<Integer> i = list.iterator();

        System.out.println(i.hasNext()); // true
        System.out.println(i.next()); // 10

        System.out.println(i.hasNext()); // true
        System.out.println(i.next()); // 20

        System.out.println(i.hasNext()); // true
        System.out.println(i.next()); // 30

        System.out.println(i.hasNext()); // true
        System.out.println(i.next()); // 40

        System.out.println(i.hasNext()); // true
        System.out.println(i.next()); // 50

        // System.out.println(i.hasNext()); // false
        // System.out.println(i.next()); // Exception in thread "main"
        // java.util.NoSuchElementException
        System.out.println();

        Iterator<Integer> i2 = list.iterator();

        while (i2.hasNext()) {
            System.out.println(i2.next());
        }
    }
}
