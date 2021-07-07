package com.qa.garage;

public class Car extends Vehicle {

	public Car(int id, int wheels, int doors, String colour) {
		super(id, wheels, doors, colour);
	}

	@Override
	public void engineSize() {
		System.out.println("medium");
	}
}
