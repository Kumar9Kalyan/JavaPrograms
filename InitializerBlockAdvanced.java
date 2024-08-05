package programs.leetcode;

// Initializer block is used to initialize a common part of various constructors of a class.
public class InitializerBlockAdvanced {
	
	
	//Default constructor
	 public InitializerBlockAdvanced() {
		 System.out.println("Inside default constructor");
	}
	 //Parameterized constructor
	 public InitializerBlockAdvanced(int x){
		System.out.println("Inside parameterized constructor"); 
	 }
	 
	 
	 //Block (One type of initializer block)
	 {
		System.out.println("Common parts of constructor invoked");
	 }

	public static void main(String[] args) {
		
		new InitializerBlockAdvanced();
		new InitializerBlockAdvanced(20);
	}
	
	 

	
}
