package com.training;

public class Book {
	
	private int bookNumber;
	private String bookName;
	private double price;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(int bookNumber, String bookName, double price) throws Exception{
		
		super();
		if(bookNumber<100 || bookNumber>1000)
		{
			throw new Exception("Book Number should be between 100 and 1000");
		}
		
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.price = price;
	}
	
	
	public int getBookNumber() {
		return bookNumber;
	}
	
	public void setBookNumber(int bookNumber) {
		if(bookNumber<100 || bookNumber>1000)
		{
			try{
			
			throw new RuntimeException("Book number should be between 100 to 1000");
			}
			
			catch(Exception e) {
				System.out.println("Book Number Error" + e.getMessage());
			}
		}
		
		this.bookNumber = bookNumber;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
	return this.bookNumber;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Book b = (Book)obj;  //here we are casting the object so that we can access its instance variables directly with the object
		return b.bookName.equals(this.bookName) &&
		b.bookNumber==this.bookNumber &&
	    b.price==this.price;
		
		//return super.equals(obj);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
	
	
	
	

}
