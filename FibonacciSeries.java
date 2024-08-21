package programs.leetcode;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms you want in fibonacci series: "+ " ");
		int num =sc.nextInt();
	
		int a=0;
		int b=1;
		
		if(num<0) {
			System.out.println("Number cannot be negative");
			return;
		}
		
		
		else if(num==0)
		{
			System.out.println(a);
		}
		else if(num==1) {
			System.out.println(a + " "+ b);
		}
		else{
			System.out.print(a + " "+ b+" ");
			int c =0;
			for(int i=2;i<num;i++) {
				 c= a+b;
				 System.out.print(c+ " ");
				 a=b;
				 b=c;
			 }
			
		}
		

	}


}
