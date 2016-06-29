package com.training;

/**
 * computes the sales tax
 * @author vnaga1
 *
 */
public class TaxWhiz {
	private double purchase;
	private double currentTax;
	private double surchargeRate;
    double amount;
	
	public TaxWhiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaxWhiz(double currentTax, double surchargeRate) {
		super();
		this.currentTax = currentTax;
		this.surchargeRate = surchargeRate;
	}


	public double getPurchaseRate() {
		System.out.println("Pruchase rate");
		System.out.println(purchase);
		return purchase;
	}

	public void setPurchaseRate(double purchase) {
		this.purchase = purchase;
	}

	public double getCurrentTax() {
		System.out.println("Current Tax");
		System.out.println(currentTax);
		return currentTax;
	}

	public void setCurrentTax(double currentTax) {
		this.currentTax = currentTax;
	}

	public double getSurchargeRate() {
		System.out.println("Surcharge rate");
		System.out.println(surchargeRate);
		return surchargeRate;
	}

	public void setSurchargeRate(double surchargeRate) {
		this.surchargeRate = surchargeRate;
	}


	public double calcTax()
	{
		amount = (purchase + (purchase * currentTax) + (purchase * currentTax * surchargeRate));
		System.out.println("Total amount");
		//System.out.println(amount);
		return amount;
	}


}
