package InterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1st solution with proper algo
		
		int num = 94371;
		int rev = 0;
		
		while(num !=0) {
			rev = rev * 10 + num % 10;
			num = num/ 10;
		}
			
		System.out.println("Reverse num is :" + rev);   //after the whilw loop print it
		
		//2nd solution with function
		
		long num1 = 123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		

	}

}
