package com.training;

public class PolicyHolder {
	
	
	  private String holderName;
	 private String nominee;
	 
	 
	 
	 
	 
	public PolicyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PolicyHolder(String holderName, String nominee) {
		super();
		this.holderName = holderName;
		this.nominee = nominee;
	}
	
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	public String payPremium(double premiumAmount)
	{
		return premiumAmount + ":=paid by cash";
		
	}
	 
}
