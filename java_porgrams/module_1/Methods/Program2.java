public class Program2{
	public static void main(String[] args){

		// test(2,2);
		// Program2.java:3: error: method test in class Program2 cannot be applied to given types;
        //         test(2,2);
        //         ^
  		// required: no arguments
  		// found:    int,int
  		// reason: actual and formal argument lists differ in length
		// 1 error

		test();
		display();

		int result = Program1.add(2,2); //Calling add method from Program1 with the help of class reference in Program2
		System.out.println(result);
	}

	public static void test(){
		System.out.println("This is test!");
	}

	public static void display(){
		System.out.println("This is display!");
	}
}