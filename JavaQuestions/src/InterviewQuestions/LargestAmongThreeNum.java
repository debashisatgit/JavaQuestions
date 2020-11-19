package InterviewQuestions;

public class LargestAmongThreeNum {

	public static void main(String[] args) {
	
		
		int x = 900;
		int y = 500;
		int z = 700;
		
		if(x>y && x>z) {
			System.out.println("x is the greatest num");
		}

		else if(y>z) {
			System.out.println("y is the greatest num");
		}
		else {
			System.out.println("z is the greatest num");
		}
	}

}
