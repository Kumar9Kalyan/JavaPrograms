package programs.leetcode;

public class Thread2 implements Runnable {

	MathsUtil mat;

	public Thread2(MathsUtil mat) {
		// TODO Auto-generated constructor stub
		this.mat = mat;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			mat.calculate(3);
		} catch (Exception e) {
			System.out.println("Exception occured in Thread2");
		}
	}

}
