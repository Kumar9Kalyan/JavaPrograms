package programs.leetcode;

public class ThreadSynchronization {

	public static void main(String args[]) {

		MathsUtil obj = new MathsUtil();// only one object
		Thread1 t1 = new Thread1(obj);
		Thread t2 = new Thread(new Thread2(obj));
		t1.start();
		t2.start();
	}
}
