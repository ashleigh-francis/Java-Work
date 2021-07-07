package com.qa.garage;

public class Bus extends Vehicle {

	public Bus(int id, int wheels, int doors, String colour, float price) {
		super(id, wheels, doors, colour, price);
	}

	@Override
	public void engineSize() {
		System.out.println("large");
	}
}
