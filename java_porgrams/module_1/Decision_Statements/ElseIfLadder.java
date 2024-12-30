public class ElseIfLadder{
	public static void main(String[] args){
		int english = 70;
		int maths = 70;
		int science = 70;
		int history = 73;
		int geography = 70;
		int total = english + maths + science + history + geography;

		// double percentage = ((total) * 100) / 500.0;
		// double percentage = (double) ((total) / 5); 70.0 as after division answer is 70
		// double percentage = (double) (total) / 5; 70.6 as total is getting converted into double(by explicit datatype conversion) and the datatype of value depends on the datatype of the operand which by default is int

		double percentage = (total) / 5.0;

		if(	
			(english >= 0 && english <= 100) &&
			(maths >= 0 && maths <= 100) &&
			(science >= 0 && science <= 100) &&
			(history >= 0 && history <= 100) &&
			(geography >= 0 && geography <= 100) 
		){
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
		else{
			System.out.println("All marks must be in the range between 0(Inclusive) and 100(Inclusive)");
		}
	}
}