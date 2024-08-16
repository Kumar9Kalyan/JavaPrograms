package programs.leetcode;

import java.util.Scanner;

public class ReverseLeftHalfPyramid {
	
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines of '*' you want: ");
		
		int number = sc.nextInt();
		printPattern(number);
		
	}

	protected static void printPattern(int num) {
		for(int i=num;i>=1;i--) {
			
			for(int k=0; k<num-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}

	
	 

	

