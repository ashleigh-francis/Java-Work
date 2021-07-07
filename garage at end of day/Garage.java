package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> collectionOfVehicles = new ArrayList<>();

	public boolean addVehicle(Vehicle x) {
		boolean added = collectionOfVehicles.add(x);
		return added; // my add and remove method does not do so by ID or type, only by index
	}

	public Vehicle removeVehicle(int x) {
		Vehicle removed = collectionOfVehicles.remove(x);
		return removed;
	}

	public void calculateBill(int numberOfWheels) {
		float Price = 10.99F;
		float total = Price * numberOfWheels;
		System.out.print("Total: £");
		System.out.println(total);

	}

	public void print() {
		System.out.println("Vehicles: ");
		for (Vehicle v : this.collectionOfVehicles) {
			v.print();

			calculateBill(v.getWheels());

		}

	}

	public void clearVehicles() {
		collectionOfVehicles.clear();
	}

}
