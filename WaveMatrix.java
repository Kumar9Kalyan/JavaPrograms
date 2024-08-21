package programs.leetcode;

import java.util.Scanner;

//In this matrix we traverse column-wise. When we traverse even column we traverse from top to bottom and 
// odd column from bottom to top direction.
public class WaveMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");

		int nor = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int noc = sc.nextInt();

		int[][] mat = new int[nor][noc];

		System.out.println("Number of rows: " + mat.length);
		System.out.println("Number of columns: "+ mat[1].length);
		System.out.println("Enter elements of matrix: ");
		for (int i = 0; i < nor; i++) {
			for (int j = 0; j < noc; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements of the matrix after column-wise traverse are as follows: ");

		for (int j = 0; j < mat[0].length; j++) {
			// For even column
			if (j % 2 == 0) {
				for (int i = 0; i < mat.length; i++) {
					System.out.print(mat[i][j] + " ");
				}
			}
			// For odd column
			else {
				for (int i = mat.length - 1; i >= 0; i--) {
					System.out.print(mat[i][j] + " ");
				}
			}

			System.out.println();
		}
	}

}
