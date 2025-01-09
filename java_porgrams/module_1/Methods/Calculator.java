public class Calculator{
	public static void main(String[] args){
		int res1 = add(2,2);
		System.out.println("Addition Result : "+(int) res1);

		int res2 = sub(2,2);
		System.out.println("Subtraction Result : "+res2);

		int res3 = multiply(2,2);
		System.out.println("Multiplication Result : "+res3);

		int res4 = divide(2,2);
		System.out.println("Divison Result : "+res4);

		int res5 = modulus(2,2);
		System.out.println("Modulus Result : "+res5);

		int res6 = power(2,3);
		System.out.println("Power Result : "+res6);
		// System.out.println("Power Result : "+ Math.pow(2,3.0));

		int initial_guess = 3;
		double root = newtonRaphson(initial_guess);
		System.out.println("Square Root of 10 : " + root);
	}

	public static int add(int a, int b){
		int sum = a + b;
		return sum;
	}

	public static int sub(int a, int b){
		int minus = a - b;
		return minus;
	}

	public static int multiply(int a, int b){
		int mul = a * b;
		return mul;
	}

	public static int divide(int a, int b){
		int div = a / b;
		return div;
	}

	public static int modulus(int a, int b){
		int mod = a % b;
		return mod;
	}

	public static int power(int a, int b){
		// int pow = Math.pow(a,b);
		int pow = 1;
		for(int i = 1; i <= b; i++){
			pow = pow * a; 
		}
		return pow;
	}

	// public static double squareRoot(int n){
	// 	double sqr = Math.sqrt(n);
	// 	return sqr;
	// }

	public static double func(double x){
		// f(x) = x^2 - 10
		return x * x - 10; 
	}

	public static double derivFunc(double x){
		// f'(x) = 2x
		return 2 * x; 
	}

	public static double newtonRaphson(double x){
		for(int i = 1; i <= 5; i++){
			// f(x) = x - (f(x)/f'(x))
			x = x - (func(x) / derivFunc(x)); 
		}
		return x;
	}
}