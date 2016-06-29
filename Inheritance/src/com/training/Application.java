package com.training;

public class Application {
	
	public static void main(String[] args) {
		
		Book b = new Book(12,"maths",21.5);
		System.out.println(b);
		
		Book[] bks = new Book[2];
		Book b1 = new Book(13,"Harvey",322.2);
		Book b2 = new Book(14,"David",657.2);
		bks[0]=b1;
		bks[1]=b2;
	BookManager.printBooks(bks);	  //printBooks is a static method, so called by class instead of object.	
	}

}
