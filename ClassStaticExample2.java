package programs.leetcode;


public class ClassStaticExample2 {
	
	 public ClassStaticExample2() {
	} 

	public static void main(String[] args) {
		
		System.out.println("Inside main method. Value of i: "+Test.i);
	}
	
	class Test{
		

		static int i;
		int j;
		
		static {
			i = 100;
			System.out.println("Static block is called");
		}
		 
	} 

	
}
