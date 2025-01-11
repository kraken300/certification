import java.util.Scanner;

public class TypeOfTriangle_5{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 : ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side 2 : ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side 3 : ");
        double s3 = sc.nextDouble();

        if(s1 <= 0 || s2 <= 0 || s3 <= 0){
            System.out.println("All sides must be greater than 0"); 
            return;
        }

        if((s1!=s2) && (s2!=s3) && (s3!=s1))
            System.out.println("Scalene Triangle"); // All sides are different

        else if(
            ((s1 == s2) && s3 != s1) ||
            ((s2 == s3) && s1 != s2) ||
            ((s3 == s1) && s2 != s3)
        )
            System.out.println("Isoceles Triangle"); // Only two sides are same and third side is different

        else
            System.out.println("Equilateral Triangle"); // All sides are same

        sc.close();
    }
}