import java.util.Scanner;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        System.out.println("Start of main");

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        sc.close();

        Demo d1 = null;

        // try {
        // int res = n1 / n2;
        // System.out.println("result : " + res);
        // System.out.println(d1.hashCode());
        // }
        // catch (ArithmeticException e) {
        // System.out.println("Denominator is 0");
        // }
        // catch (NullPointerException e) {
        // System.out.println("d1 is assigned with null");
        // }

        // System.out.println("End of main");

        // try {
        // int res = n1 / n2;
        // System.out.println("result : " + res);
        // System.out.println(d1.hashCode());
        // }
        // catch (ArithmeticException | NullPointerException e) {
        // System.out.println("Denominator is 0 OR d1 is assigned with null");
        // }

        // System.out.println("End of main");

        try {
            int res = n1 / n2;
            System.out.println("result : " + res);
            System.out.println(d1.hashCode());
        } 
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Denominator is 0 OR d1 is assigned with null");
        } 
        catch (RuntimeException e) {
            e.printStackTrace();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of main");
    }
}
