package com.training;
import com.training.MediaType;
public class Periodical extends MediaType {

	public Periodical() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Periodical(String title, String subject, double volumeNumber, double rating) {
		super(title, subject, volumeNumber, rating);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public void setSubject(String subject) {
		// TODO Auto-generated method stub
		super.setSubject(subject);
	}

	@Override
	public void setVolumeNumber(double volumeNumber) {
		// TODO Auto-generated method stub
		super.setVolumeNumber(volumeNumber);
	}

	@Override
	public void setRating(double rating) {
		// TODO Auto-generated method stub
		super.setRating(rating);
	}

	
}
