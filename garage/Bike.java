package com.qa.garage;

public class Bike extends Vehicle {

	public Bike(int id, int wheels, int door, String colour, float price) {
		super(id, wheels, door, colour, price);
	}

	@Override
	public void engineSize() {
		System.out.println("small");
	}
}
