public class VowelConsonant_8{
    public static void main(String[] args){
        char ch = 'e';

        // Condition for excluding special characters 
        if((ch >= 97 && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A', 'E', 'I', 'O', 'U':
                    System.out.print("Vowel");
                    break;
                default:
                    System.out.print("Consonant");
            }
        }
        else{
            System.out.print("Invalid Alphabet");
        }
    }
}