import java.util.ArrayList;
import java.util.Iterator;

public class FindStringElement {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(10);
        list.add('e');
        list.add("hello");
        list.add(true);
        list.add(10.55f);

        Iterator<Object> i = list.iterator();

        // while loop
        // while (i.hasNext()) {
        // if (i.next() instanceof String) {
        // System.out.println(i.next());
        // }
        // }
        while (i.hasNext()) {
            Object o = i.next();
            if (o instanceof String) {
                System.out.println(o);
            }
        }

        // enhanced for loop
        for (Object object : list) {
            if (object instanceof String) {
                System.out.println(object);
            }
        }

        // for loop
        for (int j = 0; j < list.size(); j++) {
            Object o = list.get(j);
            if (o instanceof String) {
                System.out.println(list.get(j));
            }
        }
    }
}
