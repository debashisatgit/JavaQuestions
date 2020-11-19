package InterviewQuestions;

public class PrimeNumber {
	
	
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {                             //1st logic- num less then 1 it is false,2 is the lowest prime num
			return false;
		}
		
		for(int i = 2; i<num ; i++) {           //
			if(num % i == 0) {
			return false;	
			}
		}
		return true;
	}

	public static void getPrimeNumber(int num) {   //2nd method for getting all the prime num in btw 20
		for(int i = 2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i + " is a prime numbers ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(4));
		System.out.println(isPrimeNumber(10));
		System.out.println(isPrimeNumber(17));
		System.out.println(isPrimeNumber(0));
		System.out.println(isPrimeNumber(-2));
		
		getPrimeNumber(10);
		System.out.println("****************");
		getPrimeNumber(20);
		

	}

}
