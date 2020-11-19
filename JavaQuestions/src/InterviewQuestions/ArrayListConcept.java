package InterviewQuestions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[] = new int[3];  //static array 
		
		//dynamic array --array list
		//it can contain duplicate values
		//it mentain order
		//it is not synchronised
		//it allow random access to fatch any element bcz it store the values in the bases of index
				
		ArrayList ar1 = new ArrayList();      //this is non generic arraylist wher every thing we can store
		
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		
		System.out.println(ar1.size());
		
		ar1.add(40);
		ar1.add(50);
		ar1.add(50);
		ar1.add("abcd");                     
		System.out.println(ar1.size());
		System.out.println(ar1.get(1));
		System.out.println(ar1.get(5));
		
		//print all the values from arraylist we use for loop
		
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();  //this is a generics arraylist where we can store only integer value
		
		ar2.add(2);
		ar2.add(3);
		ar2.add(4);
		//ar2.add("adcs");    can not store string
		
		System.out.println("************");
		System.out.println(ar2.get(2));
		System.out.println("*************");
		
		for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i));
		}
		
		ArrayList<String> ar3 = new ArrayList<String>();
		
		ar3.add("tst1");
		ar3.add("tst2");
		ar3.add("tst3");
		//ar3.add(123);           it wont allow integer
		
		System.out.println("////////////////"); 
		System.out.println(ar3.get(2));
		System.out.println("////////////////");
		
		for(int i=0;i<ar3.size();i++) {
			System.out.println(ar3.get(i));
		}
		
		
	}

}
