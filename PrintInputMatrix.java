package programs.leetcode;

import java.util.Scanner;

public class PrintInputMatrix {
	
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		
		int nor = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int noc = sc.nextInt();

		int[][] mat = new int[nor][noc];
		System.out.println("Enter elements of matrix: ");
		for(int i=0;i<nor;i++) {
			for(int j=0;j<noc;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elements of the matrix are as follows: ");
		
		for(int i=0; i<nor;i++) {
			for(int j=0;j<noc;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}


}

	
	 

	

