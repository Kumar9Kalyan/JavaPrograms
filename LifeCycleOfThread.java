package programs.leetcode;

public class LifeCycleOfThread implements Runnable {

	protected static LifeCycleOfThread lifeCycle;
	protected static Thread th1;

	public static void main(String[] args) {
		lifeCycle = new LifeCycleOfThread();
		th1 = new Thread(lifeCycle);

		System.out.println("State of thread1:" + th1.getState());
		th1.start();
		System.out.println("State of thread1 after calling .start() method on it-" + th1.getState());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread2 th2 = new Thread2();
		Thread thread2 = new Thread(th2);
		System.out.println("State of thread2:" + thread2.getState());
		thread2.start();
		System.out.println("State of thread2 after calling .start() method on it-" + thread2.getState());

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println("State of thread2 after calling .sleep() method on it-" + thread2.getState());

		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("State of thread2 after when it has finished it's execution-"+thread2.getState());
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(
				"State of thread1 after calling .join() method on thread 2 -" + LifeCycleOfThread.th1.getState());

	
	try {
		Thread.sleep(200);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}

}
}
