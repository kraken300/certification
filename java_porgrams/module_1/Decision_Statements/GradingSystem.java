import java.util.Scanner;

public class GradingSystem{
	public static void main(String[] args){
		// int english = 80;
		// int maths = 80;
		// int science = 90;
		// int history = 90;
		// int geography = 70;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks for English : ");
		int english = sc.nextInt();

		System.out.print("Enter marks for Maths : ");
		int maths = sc.nextInt();

		System.out.print("Enter marks for Science : ");
		int science = sc.nextInt();

		System.out.print("Enter marks for History : ");
		int history = sc.nextInt();

		System.out.print("Enter marks for Geography : ");
		int geography = sc.nextInt();
		sc.close();

		int total = english + maths + science + history + geography;
		int percentage = ((total) * 100) / 500;
		
		System.out.println("Total marks is "+ total);
		System.out.println("Percentage is "+ percentage + "%");
		System.out.println("Average is "+ (total/5));

		if(percentage < 30){
			System.out.println("Failed...");
		}

		else if(percentage >= 30 && percentage < 40){
			System.out.println("Passed with grade C2");
		}

		else if(percentage >= 40 && percentage < 50){
			System.out.println("Passed with grade C1");
		}

		else if(percentage >= 50 && percentage < 60){
			System.out.println("Passed with grade B2");
		}

		else if(percentage >= 60 && percentage < 70){
			System.out.println("Passed with grade B1");
		}

		else if(percentage >= 70 && percentage < 80){
			System.out.println("Passed with grade A2");
		}

		else if(percentage >= 80 && percentage < 90){
			System.out.println("Passed with grade A1");
		}

		else if(percentage >= 90 && percentage <= 100){
			System.out.println("Passed with Distinction");
		}
	}
}