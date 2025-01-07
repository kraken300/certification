public class MethodOverloading{
	public static void main(String[] args){
		// int ch1 = add('a',98);

		double dl1 = add('a',98);

		System.out.println(dl1);
	}

	// Exact method with same aruguments type
	// public static int add(char a, int b){
	// 	return a+b;
	// }

	// public static int add(int y, int z){
	// 	return y+z;
	// }

	public static double add(double y, double z){
		return y+z;
	}
}