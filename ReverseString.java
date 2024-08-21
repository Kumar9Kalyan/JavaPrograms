package programs.leetcode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a string to reverse: ");
		
		String str = sc.next();		

		String rev= "";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			rev =  ch + rev;
	
		}
		System.out.println("Reversed String: "+ rev);
	}


}
