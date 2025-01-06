public class Program2{
	public static void main(String[] args) {
		int res = test1();
		System.out.println(res);	
	}

	public static int test1(){
		// Narrowing
		double d1 = 3.141;
		return (int) d1; //Explicit

		// Program2.java:10: error: incompatible types: possible lossy conversion from double to int
        //         return d1; //Explicit
        //                ^
		// 1 error
	}	
}