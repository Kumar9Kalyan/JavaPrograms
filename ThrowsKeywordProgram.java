package programs.leetcode;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordProgram {

	public static void main(String[] args) {
		
		
		
		try {
		method();
		}
		catch(IOException e) {
			System.out.println(e);
		}
}

	private static void method() throws IOException {
		// TODO Auto-generated method stub
		FileReader fr= new FileReader("C:\\Users\\kumar\\Desktop\\daddy.txt");
		System.out.println("Ready?- "+fr.ready());
		char [] array = new char[100];
		int numOfChar= fr.read(array);
		System.out.println("Number of Characters: "+numOfChar+"\n"+"File text: "+String.valueOf(array));
		fr.close();
	}

	private static void validate(int age) {
		// TODO Auto-generated method stub
		
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote");
		}
		
	}	
}
		
		
		
		
			
		
		


