import java.util.Scanner;
public class IsTriangle_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle 1 : ");
        double a1 = sc.nextDouble();

        System.out.print("Enter angle 2 : ");
        double a2 = sc.nextDouble();

        System.out.print("Enter angle 3 : ");
        double a3 = sc.nextDouble();

        double sum = a1 + a2 + a3;

        if(!(a1 > 0 && a1 < 180))
            return;
        if(!(a2 > 0 && a2 < 180))
            return;
        if(!(a3 > 0 && a3 < 180))
            return;

        if(sum == 180)
            System.out.println("It is a valid traingle");
        else
            System.out.println("It is not a valid traingle");

        sc.close();
    }
}