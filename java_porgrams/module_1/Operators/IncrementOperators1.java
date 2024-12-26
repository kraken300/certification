public class IncrementOperators1{
	public static void main(String[] args){
		// pre increment
		int a = 10;
		a++;
		System.out.println(a); // 11

		int b = 20;
		System.out.println(b++); // 20
		System.out.println(b); //21

		int c = 30;
		c = c++;
		System.out.println(c); //30
		System.out.println(c); //30

		int d = 40;
		d *= d++;
		System.out.println(d); //1600
		System.out.println(d); //1600

		char ch = 'a';
		ch++;
		System.out.println(ch); //b
	}
}