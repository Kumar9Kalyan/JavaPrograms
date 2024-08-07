package programs.leetcode;


//Program to print 1 to 100 prime numbers
public class PrimeNumber1To100 {
	
	


	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			if(isPrime(i)) {
				System.out.println(i+ " is a Prime number");
			}
		}
		
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
