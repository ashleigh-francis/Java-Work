package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	public ArrayList<Vehicle> collectionOfVehicles = new ArrayList<>();

	public boolean addVehicle(Vehicle x) {
		boolean added = collectionOfVehicles.add(x);
		return added;
	}

	public Vehicle removeVehicle(int x) {
		Vehicle removed = collectionOfVehicles.remove(x);
		return removed;
	}

	public Vehicle calculateBill(int x) { // attempt at making step 3
		for (Vehicle transport : collectionOfVehicles) {
			if (transport.getId() == x) {
				Vehicle found = transport;

				return found;

			}
		}
		return null;
	}
}
