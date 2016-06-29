package com.training;

public class Threads extends Thread {
	
	public Threads(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void run(){
		
		for(int i=0;i<=10;i++)
		{
			
			//System.out.println("Current thread :="+ Thread.currentThread().getName());
			System.out.println(i+"\t : From current thread : \t"+Thread.currentThread().getName());
			//System.out.println(i);
		}
	}

}
