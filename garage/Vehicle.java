package com.qa.garage;

public class Vehicle {

	private int id;

	private int wheels;

	private int doors;

	private String colour;

	private float price;

	public Vehicle() {
		super();
	}

	public Vehicle(int id, int wheels, int doors, String colour, float price) { // all common attributes of vehicles
		super();
		this.id = id;
		this.wheels = wheels;
		this.doors = doors;
		this.colour = colour;
		this.price = price;
	}

	public void engineSize() {
		System.out.println("I have an engine but the size of such engine is unknown");
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) { // setters are always public void as they return nothing
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;

	}

	public float getPrice() {
		return price;
	}

	public void setPrice() {
		this.price = price;
	}
}
