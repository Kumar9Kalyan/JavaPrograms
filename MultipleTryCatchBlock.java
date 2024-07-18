package programs.leetcode;



public class MultipleTryCatchBlock {

	public static void main(String[] args) {
		
		
		try {
			
			
			//First try block
			try {
				int x= 0/0;
			}
			catch (ArithmeticException e) {
				System.out.println(e);
				
				
			}
			
			//Second try block
			try {
				String str1="Kalyan";
				
				int a= Integer.parseInt(str1);
			}
			catch(NumberFormatException e) {
				System.out.println(e);
			}
			//Third try block
			try {
				String str1=null;
				str1.length();
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
			
		
		
		
		}
		catch(Exception e){
	System.out.println("Default catch block executed");
		}
	
	
	
		
		System.out.println("Executed  last statement");
		}
}	
		
		
		
		
			
		
		


