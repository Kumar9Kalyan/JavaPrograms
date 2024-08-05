package programs.leetcode;

public class ClassStaticBlock {


	ClassStaticBlock() {
	}

	public static void main(String[] args) {
		
		
	}
	
	static {
		System.out.println("In static block which is exceuted when class is loaded into memory, no need of object creation");
	}
	public void print() {
		
	}
	
}