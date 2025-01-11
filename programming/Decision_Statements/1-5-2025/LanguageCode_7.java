import java.util.Scanner;
public class LanguageCode_7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter language code : ");
        String code = sc.nextLine();

        switch(code){
            case "en":
                System.out.println("Hello!");
                break;
            case "es":
                System.out.println("Hola!");
                break;
            case "fr":
                System.out.println("Bonjour!");
                break;
            default:
                System.out.println("Unsupported language code.");
        }

        sc.close();
    }
}