public class Program3{
	public static void main(String[] args) {
		byte b1 = 100;
		// Widening
		int i1 = b1; // Implicit
		System.out.println(i1);

		char ch1 = 'a';
		// Widening
		int i2 = (int) ch1; // Explicit
		System.out.println(i2);
	}
}