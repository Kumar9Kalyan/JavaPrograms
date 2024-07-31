package programs.leetcode;


 class MathsUtil  {
	
	public  void calculate(int n) {
		
		//Synchronized block
		 synchronized (this) {
			
		
			for(int i=1;i<=10;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		 }
	
	}
	}

