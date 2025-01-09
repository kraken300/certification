import java.util.Scanner;

public class StepDiceGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a step between 1-6: ");
        int step = sc.nextInt();

        int cp_1 = 500, cp_2 = 600, cp_3 = 700, cp_4 = 800, cp_5 = 900, cp_6 = 1000; 

        switch(step){
            case 1:
                System.out.println("Cash Price won: " + cp_1);
                break;
            case 2:
                System.out.println("Cash Price won: " + (cp_1 + cp_2));
                break;
            case 3:
                System.out.println("Cash Price won: " + (cp_1 + cp_2 + cp_3));
                break;
            case 4:
                System.out.println("Cash Price won: " + (cp_1 + cp_2 + cp_3 + cp_4));
                break;
            case 5:
                System.out.println("Cash Price won: " + (cp_1 + cp_2 + cp_3 + cp_4 + cp_5));
                break;
            case 6:
                System.out.println("Cash Price won: " + (cp_1 + cp_2 + cp_3 + cp_4 + cp_5 + cp_6));
                break;
            default:
                System.out.println(-1);
        }

        sc.close();
    }
}