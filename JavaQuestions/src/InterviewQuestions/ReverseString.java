package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";
		//how to reverse a string
		//string is immutiable means no inbuild reverce function is there
		//System.out.println();
		  
		//1st way:ussing for loop
		
		int len = s.length();               //this will give length of the string	
		String rev = "";                  //declare a blank verable after creating for loop	
		for(int i = len-1; i>=0;i--) {	
			rev = rev + s.charAt(i);    //store it in rev and upand
			
			//if we will print it inside the for loop it will giv the OP like piramate
			//System.out.println(rev);
		}
		
		System.out.println("reverse Output is = " + rev);     //out of for loop print it
		
		
		//2nd way:StringBuffer is a java class is also a mutiable class
		//also stringbuffer is having inbuild reverse function
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
//		
		
		
		
	}

}
