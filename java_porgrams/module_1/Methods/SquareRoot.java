public class SquareRoot{
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

	public static void main(String[] args) {
		int initial_guess = 3;
		double root = newtonRaphson(initial_guess);
		System.out.println("Root : " + root);
	}
}