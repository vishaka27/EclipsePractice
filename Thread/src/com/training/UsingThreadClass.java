package com.training;

public class UsingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NEW THREAD
		Thread t1 = new Threads("Vishaka");
		
		Thread t2 = new Threads("Vish");
		
		Thread t3 = new Threads("V");
		
		//MAKING IT RUNNABLE
		
		t1.start();
		t2.start();
		t3.start();
		
		//TO MAKE IT RUNNING. 
		
	    t1.run();
	    t2.run();
	    t3.run();
	}

}
