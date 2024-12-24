public class ArithmeticOperators1{
    public static void main(String[] args){
        System.out.println(10+20);
        System.out.println(3333.33+20);

        byte b1 = 10;
        byte b2 = 20;
        // byte result = b1+b2;
        // java:7: error: incompatible types: possible lossy conversion from int to byte
        // byte result = b1+b2;
        //                 ^
        // 1 error
        byte res = 30+10;
        System.out.println(res);
    }
}