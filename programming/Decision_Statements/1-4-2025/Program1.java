public class Program1{
    public static void main(String[] args){
        int a = 10, b = 200;
        char ch = 'A';
        double d = 65.0;

        int res = ++a + ++b - --a - --ch + ++ch%a + (int)++d/5 - ++ch + ++b - --b - --b + (int)++d;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("ch = "+ ch);
        System.out.println("d = "+ d);
        System.out.println("res = "+ res);
    }
}