public class ArithmeticOperators4{
    public static void main(String[] args){
        int a = 5;
        char b = '5';
        String c = "5";

        System.out.println(10-5);
        System.out.println(b-a);
        System.out.println(b*a);
        // System.out.println(a-c);
        // ArithmeticOperators4.java:9: error: bad operand types for binary operator '-'
        // System.out.println(a-c);
        //                     ^
  		// first type:  int
  		// second type: String
		// 1 error
    }
}