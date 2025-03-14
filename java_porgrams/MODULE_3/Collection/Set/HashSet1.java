import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(0);
        set.add(8);
        set.add(16);
        set.add(20);
        set.add(18);
        set.add(32);
        set.add(66);
        set.add(0);
        set.add(null);
        set.add(null);

        System.out.println(set);
    }
}