public class MethodOverloading2{
	public static void main(StringBuffer[] args){
		System.out.println("main(StringBuffer[] args)");
	}
	
	public static void main(StringBuilder[] args){
		System.out.println("main(StringBuilder[] args)");
	}

	// JVM only knows that main method that has the "main(String[])" signature 
	public static void main(String[] args){
		System.out.println("main(String[] args)");
	}

	public static void main(String args){
		System.out.println("main(String args)");
	}

	public static void main(int[] args){
		System.out.println("main(StringBuilder[] args)");
	}

}