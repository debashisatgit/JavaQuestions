package InterviewQuestions;

public class StringMonupulation {

	public static void main(String[] args) {
		
		
		String str = "Her Name is Aradhana";
		String str1 = "Her Name IS Aradhana";
		
		System.out.println(str.length());                          //to find the length of strng
		
		System.out.println(str.charAt(12));                       //for getting the char at perticular index value
		
		System.out.println(str.indexOf("A"));                    //for getting the index of perticular char
		
		System.out.println(str.indexOf("n", 12));                //for getting char index we can pass from where it will start count
		
		System.out.println(str.indexOf("debashis"));             //no exception it will return -1 if the string is not available
		
		
		//String comperision
		
		System.out.println(str.equals(str1)); 
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(0, 8));
		
		//Trim function - 3 types of spaces r there- before space,between space, after space
		
		String s = "   HI Deashis   ";
		System.out.println(s.trim());                          //it will trimm the before space and after space but not the between space
		
		System.out.println(s.replace(" ", ""));                //this will replace the between space old char and new char ()
		
		String date = "11-08-2020";
		System.out.println(date.replace("-", "/"));            //this will replace the between space old char and new char ()
		
		//Split the charector
		
		String test="Hi_My_Name_Is_Selenuum";
		String testval[] = test.split("_");		             //spliet() always return a string array
		for(int i=0;i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
