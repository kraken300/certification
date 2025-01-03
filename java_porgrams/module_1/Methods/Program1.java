public class Program1{
	public static void main(String[] args){
		int result = add(10, 20);
		System.out.println(result);

		System.out.println("Result is : "+add(20,20));

		// System.out.println("Result is : "+add());
		// Program1.java:8: error: method add in class Program1 cannot be applied to given types;
        //         System.out.println("Result is : "+add());
        //                                           ^
  		// required: int,int
  		// found:    no arguments
  		// reason: actual and formal argument lists differ in length
		// 1 error
	}

	public static int add(int a, int b){
		int sum = a + b;
		return sum;
	}
}