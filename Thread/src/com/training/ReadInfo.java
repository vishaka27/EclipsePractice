/**
 * 
 */
package com.training;

import java.io.IOException;

/**
 * @author vnaga1
 *
 */
public class ReadInfo extends Thread {
	
	public void run(){
		if(this.isInterrupted())
		{
			System.out.println("Interrupted");
		}
		
		System.out.println("Reading");
		
		try {
			
			System.in.read();
			
			
			Thread t = new Thread() {
				  public void run(){
					  
					  System.out.println("Sleeping for 200 milli sec");
					  try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  }
			};
			
			t.start();
			t.join();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Finished Reading");
		
	}	

}
