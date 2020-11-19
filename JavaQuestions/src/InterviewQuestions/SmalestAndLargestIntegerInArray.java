package InterviewQuestions;

import java.util.Arrays;

public class SmalestAndLargestIntegerInArray {

	public static void main(String[] args) {
		
		
		int number[] = {-10, 55, -75, 99, -88, 109};
		
		int largest = number[0];
		int smallest = number[0];
		
		for(int i=1; i<number.length;i++) {
			if(number[i]>largest) {
				largest = number[i];
			}
			else if(number[i]<smallest) {
				smallest = number[i];
			}
		}
		System.out.println("\n given array is ::" + Arrays.toString(number));
		System.out.println("Largest number is::" + largest);
		System.out.println("Smallest number is::" + smallest);
		
		
		
		
		
	}

}
