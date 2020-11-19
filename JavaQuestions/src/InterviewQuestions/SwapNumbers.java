package InterviewQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 19;
		int b = 29;
		
		System.out.println("before swaping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
