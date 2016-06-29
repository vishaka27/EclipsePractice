package com.training;

public class BookManager {

	public static void  printBooks(Book[] bks)
	{
		for(Book b : bks)
		{
			System.out.print(b);
			System.out.println("Discount:="+findDiscount(b.getPrice()));
			
		}
		
		
		
	}
	
	public static double findDiscount(double price)
	{
		return price*.10;
		
	}
	
}
