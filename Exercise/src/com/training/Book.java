package com.training;
import com.training.MediaType;
public class Book extends MediaType {
	
	
	private String author;
	private int ISBN;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String title, String subject, double volumeNumber, double rating,String author, int iSBN) {
		super(title, subject, volumeNumber, rating);
		this.author = author;
		ISBN = iSBN;
		// TODO Auto-generated constructor stub
	}

	
     public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getISBN() {
		return ISBN;
	}


	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}


	@Override
	public void display()
	{
		super.display();
		System.out.println(getAuthor());
		System.out.println(getISBN());
	
	}

	
}