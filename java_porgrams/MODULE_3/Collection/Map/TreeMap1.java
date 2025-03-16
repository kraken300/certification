import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class TreeMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        // to add elements
        map.put(2, "MIKE");
        map.put(3, "SAM");
        map.put(1, "JOHN");
        map.put(4, "SMITH");

        System.out.println("After adding elements : " + map);

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entrySet2 : entrySet) {
            System.out.println(entrySet2.getKey() + " " + entrySet2.getValue());
        }
    }
}
