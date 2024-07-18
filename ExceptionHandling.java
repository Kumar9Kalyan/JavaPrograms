package programs.leetcode;



public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		try {
			
			String str=null;
			str.length() ;
			int a= Integer.parseInt(str);
			int x= 0/0;
			
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Executed finally block");
		}
		
			System.out.println("Executed  last statement");
		
		
}
}
