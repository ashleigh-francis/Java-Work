package com.qa.garage;

public class Bike extends Vehicle {

	public Bike(int id, int wheels, int door, String colour) {
		super(id, wheels, door, colour);
	}

	@Override
	public void engineSize() {
		System.out.println("small");
	}
}
