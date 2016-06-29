package com.training;

public class Application {

	
	public static void main(String[] args) {
		
		LifeInsurance policy = new LifeInsurance(10199,"MoneyBack",500000.00,"QTR");
		
		PolicyHolder holder = new PolicyHolder("Ramesh","Suresh");
		
		InsuranceAgent agent = new InsuranceAgent("Yuhu");
		
		double premiumAmount = agent.calculatePremium(policy);
		String message = holder.payPremium(premiumAmount);
		
		System.out.println(message);
	}
}
