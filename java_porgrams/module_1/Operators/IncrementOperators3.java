public class IncrementOperators3{
	public static void main(String[] args){
		int a = 10;
		int b = 20;

		boolean result = (a++ > ++b) && (++b > a++);
		System.out.println(a); // 11
		System.out.println(b); // 21
		System.out.println(result); // false
	}
}