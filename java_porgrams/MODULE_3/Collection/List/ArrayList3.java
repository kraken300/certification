import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(10);
        list.add('e');
        list.add("hello");
        list.add(true);
        list.add(10.55f);

        System.out.println("\nfor loop");
        // for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nenhanced for loop");
        // Enhanced for loop
        for (Object object : list) {
            System.out.println(object);
        }

        System.out.println("\nforEach method");
        // forEach method
        list.forEach(i -> System.out.println(i)); // Lambda Expression

        System.out.println("\ncall by reference");
        list.forEach(System.out::println);
    }
}
