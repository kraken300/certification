public class Program1{
	public static void main(String[] args) {
		int res = test1();
		System.out.println(res);	
	}

	public static int test1(){
		// Widening
		char ch = 'a';
		return ch; //Implicit
	}	

	public static int test2(){
		// Widening
		char ch = 'a';
		return (int) ch; //Explicit
	}	
}