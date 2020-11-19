package InterviewQuestions;

public class VowelOrConstant {

	public static void main(String[] args) {
	
		//a e i o u
		
		char ch = 'k';
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		}
		else {
			System.out.println(ch + " is constant");
		}
	}

}
