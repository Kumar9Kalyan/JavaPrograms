package programs.leetcode;

import java.util.Scanner;

//Program to check whether an input number is prime or not
public class PrimeNumber {
	
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean next =true;
		while(next) {
		System.out.print("Enter a number to find whether it's a prime number: ") ;
		int x = sc.nextInt();		
	
			if(isPrime(x)) 
				System.out.println(x + " is a Prime number");
			
			else
				System.out.println(x+" is not a prime number");
			System.out.print("Want to input other number...enter true else false: ");
			next = sc.nextBoolean();
		}
		sc.close();
		
	}
	
	static boolean isPrime(int x) {
		
		if(x==0 || x==1) {
			return false;
		}
		for(int i=2;i<=x/2;i++) {
			if(x%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}

	
	 

	

