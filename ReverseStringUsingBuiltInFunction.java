package programs.leetcode;

import java.util.Scanner;

public class ReverseStringUsingBuiltInFunction {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a string to reverse: ");
		
		String str = sc.next();		

		StringBuilder strBuild = new StringBuilder();
		strBuild.append(str);
		strBuild.reverse();
		System.out.println("Reversed String: "+ strBuild);
	}


}
