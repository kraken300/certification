public class Calculator{
	public static void main(String[] args){
		double res1 = add(2,2.5);
		System.out.println("Addition Result : "+(int) res1);

		double res2 = sub(2,2.5);
		System.out.println("Subtraction Result : "+res2);

		double res3 = multiply(2,2.5);
		System.out.println("Multiplication Result : "+res3);

		double res4 = divide(2,2.5);
		System.out.println("Divison Result : "+res4);

		double res5 = modulus(2,2.5);
		System.out.println("Modulus Result : "+res5);

		double res6 = power(2,2.5);
		System.out.println("Powet Result : "+res6);

		double res7 = squareRoot(2.5);
		System.out.println("Square Root Result : "+res7);
	}

	public static double add(double a, double b){
		double sum = a + b;
		return sum;
	}

	public static double sub(double a, double b){
		double minus = a - b;
		return minus;
	}

	public static double multiply(double a, double b){
		double mul = a * b;
		return mul;
	}

	public static double divide(double a, double b){
		double div = a / b;
		return div;
	}

	public static double modulus(double a, double b){
		double mod = a % b;
		return mod;
	}

	public static double power(double a, double b){
		double pow = Math.pow(a,b);
		return pow;
	}

	public static double squareRoot(double n){
		double sqr = Math.sqrt(n);
		return sqr;
	}
}