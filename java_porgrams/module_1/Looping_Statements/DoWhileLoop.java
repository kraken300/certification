// WAP to print table of 5
public class DoWhileLoop{
	public static void main(String[] args){

		int num = 15;
		int i = 1; // Initialization

		do {
			System.out.println(num +" x " + i + " = " + (num*i));
			i++;
		}while(i<=10);
	}
}