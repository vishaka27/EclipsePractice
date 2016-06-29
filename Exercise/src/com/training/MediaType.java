package com.training;
abstract public class MediaType {
	
	 private String title;
	 private String subject;
	 private double volumeNumber;
	 private double rating;
	 
	public MediaType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MediaType(String title, String subject, double volumeNumber, double rating) {
		super();
		this.title = title;
		this.subject = subject;
		this.volumeNumber = volumeNumber;
		this.rating = rating;
	}
	public void display()
	{
		System.out.println(getTitle());
		System.out.println(getSubject());
		System.out.println(getVolumeNumber());
		System.out.println(getRating());
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setVolumeNumber(double volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSubject() {
		return subject;
	}
	public double getVolumeNumber() {
		return volumeNumber;
	}
	public double getRating() {
		return rating;
	}
}
