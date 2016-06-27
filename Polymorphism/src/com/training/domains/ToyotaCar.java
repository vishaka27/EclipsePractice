package com.training.domains;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 89000.00;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Jet Blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Innova";
	}

}
