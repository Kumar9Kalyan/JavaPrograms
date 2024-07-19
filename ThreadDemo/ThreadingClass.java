package programs.leetcode;

public class ThreadingClass extends Thread{

	
		
		@Override
		public void run() {
			
		try {
		System.out.println("Thread: "+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
		}
}

	

