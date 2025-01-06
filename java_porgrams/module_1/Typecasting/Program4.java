public class Program4{
	public static void main(String[] args) {
		double d1 = 3.141;
		// Narrowing
		int i1 = (int) d1; // Explicit
		System.out.println(i1);
	}
}

		// Program4.java:5: error: incompatible types: possible lossy conversion from double to int
        //         int i1 = d1; // Explicit
        //                  ^
		// 1 error