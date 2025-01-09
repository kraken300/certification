import java.util.Scanner;

public class ScannerExample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter byte : ");
		byte b1 = sc.nextByte();
		System.out.println("byte : " + b1);

		System.out.print("Enter short : ");
		short sh1 = sc.nextShort();
		System.out.println("short : " + sh1);

		System.out.print("Enter int : ");
		int i1 = sc.nextInt();
		System.out.println("int : " + i1);

		System.out.print("Enter String(nextLine) : ");
		String s2 = sc.nextLine();
		System.out.println("String(nextLine) : " + s2);

		System.out.print("Enter long : ");
		long l1 = sc.nextLong();
		System.out.println("long : " + l1);

		System.out.print("Enter float : ");
		float f1 = sc.nextFloat();
		System.out.println("float : " + f1);

		System.out.print("Enter double : ");
		double d1 = sc.nextDouble();
		System.out.println("double : " + d1);

		System.out.print("Enter boolean : ");
		boolean bl1 = sc.nextBoolean();
		System.out.println("boolean : " + bl1);

		System.out.print("Enter String(next) : ");
		String s1 = sc.next();
		System.out.println("String(next) : " + s1);

		// System.out.print("Enter String(nextLine) : ");
		// String s2 = sc.nextLine();
		// System.out.println("String(nextLine) : " + s2);

		System.out.print("Enter char : ");
		char ch1 = sc.next().charAt(0);
		System.out.println("char : " + ch1);

		sc.close();
	}
}