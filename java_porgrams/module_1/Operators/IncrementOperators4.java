public class IncrementOperators4{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		char ch = 'a';

		int result = a++ + ++ch - --ch + ++a + --b - --b*5/a-- + ++ch - --a;
		System.out.println(a); // 10
		System.out.println(b); // 18
		System.out.println(ch); // b
		System.out.println(result); // 123
	}
}