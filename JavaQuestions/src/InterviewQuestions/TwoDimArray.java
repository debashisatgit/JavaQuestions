package InterviewQuestions;

public class TwoDimArray {

	public static void main(String[] args) {
		
		
		String x[][] = new String[3][5];      //this is called 2 dim array with 3 row and 5 collum
		
		System.out.println(x.length);         //it will giv you total num  of rows
		System.out.println(x[0].length);      //it will giv total num of collum 
		
		//how to store the value in row and collum
		
		x[0][0] ="A";
		x[0][1] ="B";
		x[0][2] ="9";
		x[0][3] ="Dev";
		x[0][4] ="E";
		
		x[1][0] ="A1";
		x[1][1] ="B1";
		x[1][2] ="9.9";
		x[1][3] ="D1";
		x[1][4] ="E1";		
		
		x[2][0] ="A2";
		x[2][1] ="B2";
		x[2][2] ="99";
		x[2][3] ="Selenium";
		x[2][4] ="E2";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);
		System.out.println("******************");
		
		//if want to print all the value od 2-d array ,have to use 2 for loop 1 for row and 1 for col
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		
		
		
	}

}
