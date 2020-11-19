package InterviewQuestions;

import java.util.Scanner;

public class PrintAnInteger {

	public static void main(String[] args) {
		
		//to print an integer by user at end, we need Scanner
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int num = reader.nextInt();
		
		System.out.println("you entered:"+ num);
		
		
		
	}

}
