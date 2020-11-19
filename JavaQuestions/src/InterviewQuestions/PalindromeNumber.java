package InterviewQuestions;

public class PalindromeNumber {
	
	
	public static void isPalindromreNumber(int num) {
		System.out.println("given num is : " + num + " which is a ");
	
	int r = 0;
	int sum = 0;
	int t;
	
	t = num;
	
	while(num>0) {
		r = num % 10;
		sum = (sum*10) +r;     //get the reminder sum = sum*10 +r and num = num/10       ----imp logic
		num=num/10;
	}
	
	if(t==sum) {
		System.out.println("Palindrom num");
	}else {
		System.out.println("not a palindrum num");
	}
		
	}

	public static void main(String[] args) {
		
		isPalindromreNumber(151);
		isPalindromreNumber(153);
		
		
		
		
		

	}

}
