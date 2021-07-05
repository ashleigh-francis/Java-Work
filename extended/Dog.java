package com.qa.person.extended;

public class Dog {

	public String name;

	public int age;

	public String colour;

	public Dog(String name, int age, String colour) { // Insert into 'USER (ID, USERNAME, EMAIL) VALUES
														// (...)
		this.name = name; // sets my name equal to the incoming name
		this.age = age;
		this.colour = colour;

	}

	public Dog() {

	}

	public void speak() {
		System.out.println("WOOF!!");
	}

	public void printDog() {
		System.out.print(" name: ");
		System.out.println(this.name);
		System.out.print(" age: ");
		System.out.println(this.age);
		System.out.print(" colour: ");
		System.out.println(this.colour);
	}

}
