public class ElseIfLadder{
	public static void main(String[] args){
		int english = 80;
		int maths = 80;
		int science = 90;
		int history = 90;
		int geography = 70;
		int total = english + maths + science + history + geography;

		int percentage = ((total) * 100) / 500;
		System.out.println("Total is "+ total);
		System.out.println("Percentage is "+ percentage + "%");

		if(percentage < 30){
			System.out.println("Failed...");
		}

		else if(percentage >= 30 && percentage < 40){
			System.out.println("Passed C2");
		}

		else if(percentage >= 40 && percentage < 50){
			System.out.println("Passed C1");
		}

		else if(percentage >= 50 && percentage < 60){
			System.out.println("Passed B2");
		}

		else if(percentage >= 60 && percentage < 70){
			System.out.println("Passed B1");
		}

		else if(percentage >= 70 && percentage < 80){
			System.out.println("Passed A2");
		}

		else if(percentage >= 80 && percentage < 90){
			System.out.println("Passed A1");
		}

		else if(percentage >= 90 && percentage <= 100){
			System.out.println("Passed Distinction");
		}
	}
}