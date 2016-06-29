package com.training;

public class PrintString1 {

	
	 public synchronized static void print(String str1, String str2)
	   {
		   System.out.println(str1);
		   
		   try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println(str2); 
	   }
}
