/**
 * 
 */
package com.training;

/**
 * @author vnaga1
 * Main Starting will execute first, then it will go to Readinfo and take input from the user. Then it will come back to main and will print main finish
 */
public class ExampleForJoin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Main Starting");
		
		Thread info = new ReadInfo();
		
		info.start();
		//info.interrupt();
		//System.out.println("\n Interrupted:"+info.isInterrupted());
		System.out.println(info.isAlive());
		
		
		try {
			info.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		//System.out.println("\n Interrupted:"+info.isInterrupted());
		Thread t = new Thread() {
			  public void run(){
				  
				  System.out.println("Sleeping for 1000 milli sec");
				  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
		};
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Finish");
		//System.out.println(info.isDaemon());
		
		System.out.println(info.isAlive());   // to check if the thread is dead or alive. In this case, it will return false.
		
	}

}
