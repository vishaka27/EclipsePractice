package com.training;

public class UsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable = new SecondThread();
		Thread thread1 = new Thread(runnable,"Vishaka");  //we are passing runnable along with the name
		
		Thread thread2 = new Thread(runnable,"Vish");
		
		Thread thread3 = new Thread(runnable,"V");
	 thread1.start();
	 thread2.start();
	 thread3.start();
		

	}

}
