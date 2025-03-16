import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        // to add elements
        map.put(1, "JOHN");
        map.put(2, "MIKE");
        map.put(3, "SAM");
        map.put(4, "SMITH");

        System.out.println("After adding elements : " + map);

        // for fetching all entries as Map.Entry
        System.out.println("For fetching all entries as Map.Entry");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entrySet2 : entrySet) {
            System.out.println(entrySet2.getKey() + " " + entrySet2.getValue());
        }
    }
}
