package com.training;

public class Book {
	
	private long bookNumber;
	private String bookName;
	private double price;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(long bookNumber, String bookName, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.price = price;
	}
	
	
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
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
	public String toString() {
		// TODO Auto-generated method stub
	
	return this.bookNumber+":"+this.bookName+":"+this.price;
	
	//return super.toString()+":"+this.bookNumber+":"+this.bookName+":"+this.price;
	}
	
	
}
