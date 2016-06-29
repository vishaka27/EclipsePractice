package com.training;

public class SecondThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++)
		{
			
			//System.out.println("Current thread :="+ Thread.currentThread().getName());
			System.out.println(i+"\t : From current thread : \t"+Thread.currentThread().getName());
			//System.out.println(i);
		}

	}

}
