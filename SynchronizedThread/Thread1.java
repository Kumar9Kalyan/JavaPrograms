package programs.leetcode;

public class Thread1 extends Thread {
	
	MathsUtil mat;
	
	public Thread1(MathsUtil mat) {
		this.mat= mat;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		try {
			mat.calculate(2);
		}catch(Exception e) {
			System.out.println("Exception occured in Thread1");
		}
		
		
		
	}
}
