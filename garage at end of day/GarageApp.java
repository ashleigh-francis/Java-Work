package com.qa.garage;

public class GarageApp {
	public static void main(String[] args) {

		Garage manager = new Garage();

		Vehicle Car1 = new Car(1, 4, 2, "silver"); // this has created the car object
		manager.addVehicle(Car1); // then this has added the car object I just made into the
									// collectionOfVehicles array list

		Vehicle Bike1 = new Bike(2, 2, 0, "black");
		manager.addVehicle(Bike1);

		Vehicle Bus1 = new Car(3, 4, 2, "red");
		manager.addVehicle(Bus1);

		manager.print();

		manager.removeVehicle(0);
		manager.print();

		// manager.clearVehicles();
		// manager.print(); This made it look like I did no work for the entire day
	}

}
