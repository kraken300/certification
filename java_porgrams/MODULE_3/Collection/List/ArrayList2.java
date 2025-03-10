import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(10);
        list.add('e');
        list.add("hello");
        list.add(true);
        list.add(10.55f);

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(100);
        list2.add("hi");
        list2.add("java");

        list.addAll(list2);
        System.out.println(list);

        // System.out.println(list.size());
        // System.out.println(list.get(7));
        // System.out.println(list.remove(7));
        // System.out.println(list);

        list.retainAll(list2);
        System.out.println(list);

        // list.retainAll(list2);
        // System.out.println(list);
        // System.out.println(list2);
    }
}
