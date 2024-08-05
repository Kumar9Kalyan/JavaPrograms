package programs.leetcode;


public class InitializerBlockExample1 {
	
	//Instance variable
	int speed;
	
	 public InitializerBlockExample1() {
		 System.out.println("Speed of car: "+ speed);
	} 
	 //Block (One type of initializer block)
	 {
		 speed = 70;
	 }

	public static void main(String[] args) {
		
		new InitializerBlockExample1();
	}
	
	 

	
}
