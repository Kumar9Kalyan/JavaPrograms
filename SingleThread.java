package programs.leetcode;

public class SingleThread {

	public static void main(String[] args) {

		Thread th = Thread.currentThread();
		th.setName("My main thread");
		th.setPriority(4);
		System.out.println(th);
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		

	}


}
