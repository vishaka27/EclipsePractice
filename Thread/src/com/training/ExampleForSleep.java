package com.training;

public class ExampleForSleep {
	
	public static void main(String[] args) {
		
		/**
		 * Here sleep() can give Interrupted Exception which is a checked exception so it needs to be put in a try catch block
		 */
		
		try {                                                
			
			System.out.println("SBBB");
			Thread.sleep(1000);
			System.out.println("Sapient");
			Thread.sleep(1200);
			System.out.println("Brilliant");
			Thread.sleep(1000);
			System.out.println("Batch");
			Thread.sleep(100);
			System.out.println("B");
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
