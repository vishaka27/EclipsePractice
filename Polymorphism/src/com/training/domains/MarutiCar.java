package com.training.domains;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		
		return 70000.00;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Silky Silver";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Swift-Dezire";
	}

}
