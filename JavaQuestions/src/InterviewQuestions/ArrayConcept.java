package InterviewQuestions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//All these are called 1 dimensinol array bcz we have given 1 squre bracket[]
		//To store similar data type variable in a array variable
		//how to declare integer array
		
		//dis advantage of array:
		//1.size is fixed - which is called "static array" - to over come this problem we use obj array (array list,hash table collections)
		//2.Stores only similar data types
		
		
		//Integer array:
		
		int i[] = new int[4];                 //i is the array variable with size 4 
		
		i[0] = 10;                            //4 value given to the size 
		i[1] = 20;                            //can only store int variable, cant store decimal,floting,string
		i[2] = 30;
		i[3] = 40;
		
		//lower index = 0
		//upper index = n-1 where - n is size of array
		
		System.out.println(i[2]);             //print the value of i with index 2
		System.out.println(i[3]);
		
		//System.out.println(i[4]);            if u will print a size which is not there it will giv "ArrayIndexOutOfException"
		 
		System.out.println(i.length);
		
		//for printing all the value of array we will use for loop
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
			
		}
		
		//Double Array :
		
		double d[] = new double[3];
		
		d[0] = 10.1;
		d[1] = 20.2;
		d[2] = 30.3;
		
		System.out.println(d[2]);
		
		//Char Array
		
		char c[] = new char[2];
		c[0] = 'a';
		c[1] = '$';
		
		System.out.println(c[1]);
		
		//boolean Array
		
		boolean b[] = new boolean[2];
		
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[1]);
		
		//String Array
		
		String s[] = new String[2];
		
		s[0] = "dev";
		s[1] = "Selenium";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s.length);
		
		
		
		//to over come static we use obj array
		//Object array is use to store diff data types values
		
		Object ob[] = new Object[6];
		
		ob[0] = "dev";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "2/9/1990";
		ob[4] = 'M';
		ob[5] = "India";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		for(int a=0;a<i.length;a++) {
			System.out.println(ob[a]);
		}
		
		
		
		
		
		

	}

}
