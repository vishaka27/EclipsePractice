package com.training.ifaces;
public interface Automobile {
	
	public static final String SHOWROOM_NAME = "Ramesh cars";
	
	/*
	 * All the methods in the interface are implicitly public and abstract
	 * 
	 */
	public abstract double getPrice();  //by default all the methods r abstract, so even if abstract is not mentioned, it won't show wny error
	public String getColor();  //all 3 statements are same only
     String getModel();

	
	
}
