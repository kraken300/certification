import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Add entry in Map
        map.put(2, "abc");
        map.put(6, "xyz");
        map.put(3, "pqr");
        map.put(16, "def");

        System.out.println("After adding elements : " + map);

        // To remove entry from map
        map.remove(6);
        System.out.println("After removing element : " + map);

        // To fetch values
        System.out.println(map.get(16));

        // Iteration of a map using keys
        System.out.println("Iterating using keys : ");
        Set<Integer> entrySet = map.keySet();
        for (Integer i : entrySet) {
            System.out.println(i);
        }

        System.out.println();

        // Iteration of a map using keys
        System.out.println("Iterating values : ");
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }

        System.out.println();

        // for fetching all values as Collection
        System.out.println("For fetching all values as Collection : ");
        Collection<String> list = map.values();
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println();

        // for fetching all entries as Map.Entry
        System.out.println("For fetching all entries as Map.Entry : ");
        Set<Map.Entry<Integer, String>> entry = map.entrySet(); // InnerClass
        for (Map.Entry<Integer, String> entry2 : entry) {
            System.out.print(entry2.getKey() + " : ");
            System.out.println(entry2.getValue());
        }

        System.out.println();
        // Other important methods of Map
        System.out.println("Other important methods of Map");
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("abc"));
        map.clear();
        System.out.println(map);
    }
}