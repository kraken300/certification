import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(0);
        set.add(6);
        set.add(10);
        set.add(2);
        set.add(-5);

        System.out.println(set);

        int[] arr = new int[] { 5, 6, 4, 2, 3, 1 };

        int[] arr2 = sortArray(arr);

        for (int i : arr2) {
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i : arr) {
            set.add(i);
        }

        Object[] obj = set.toArray();

        for (int i = 0; i < obj.length; i++) {
            Integer integer = (Integer) obj[i];
            arr[i] = integer;
        }

        return arr;
    }
}
