import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();

        fruits.push("Apple");
        fruits.push("Pineapple");
        fruits.push("Greenapple");
        fruits.push("Kiwi");
        fruits.push("Mango");

        System.out.println(fruits); // [Apple, Pineapple, Greenapple, Kiwi, Mango]

        System.out.println(fruits.pop()); // Mango
        System.out.println(fruits); // [Apple, Pineapple, Greenapple, Kiwi]
        System.out.println(fruits.peek()); // Kiwi
    }
}
