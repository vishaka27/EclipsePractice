package com.training;
import com.training.MediaType;
public class DVD extends MediaType {
	
	private int lendingLen;

	
	
	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DVD(String title, String subject, double volumeNumber, double rating,int lendingLen) {
		super(title, subject, volumeNumber, rating);
		this.lendingLen = lendingLen;
		// TODO Auto-generated constructor stub
	}

	public int getLendingLen() {
		return lendingLen;
	}

	public void setLendingLen(int lendingLen) {
		this.lendingLen = lendingLen;
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
