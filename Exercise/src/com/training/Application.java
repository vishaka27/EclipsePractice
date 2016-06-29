package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TaxWhiz tax= new TaxWhiz(0.1,0.1);
   tax.setPurchaseRate(5000.00);
  tax.getSurchargeRate();
  tax.getCurrentTax();
  tax.getPurchaseRate();
  tax.calcTax();
  System.out.println(tax.amount);
	}
}
