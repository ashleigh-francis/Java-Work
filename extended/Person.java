package com.qa.person.extended;

import java.util.ArrayList;

public class Person {

	public String name;

	public int age;

	public String job;

	public ArrayList<Cat> cats = new ArrayList<>();
	public ArrayList<Dog> dogs = new ArrayList<>();

	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;

	}

	public Person() {

	}

	public boolean addCat(Cat x) {
		boolean added = cats.add(x);
		return added;
	}

	public Cat removeCat(int x) {
		Cat removed = cats.remove(x);
		return removed;

	}

	public boolean addDog(Dog x) {
		boolean added = dogs.add(x);
		return added;
	}

	public Dog removeDog(int x) {
		Dog removed = dogs.remove(x);
		return removed;
	}

	public void print() {
		System.out.print(" name: ");
		System.out.println(this.name);
		System.out.print(" age: ");
		System.out.println(this.age);
		System.out.print(" job: ");
		System.out.println(this.job);

		// for (int i = 0; i < cats.size(); i++) {
		// cats.get(i).printCat();
		// }

		for (Cat lesChats : cats) { // ENHANCED FOR LOOP
			System.out.println("Cats: ");
			lesChats.printCat();
		}

		// for (int i = 0; i < dogs.size(); i++) {
		// dogs.get(i).printDog();
		// }

		for (Dog lesChiens : dogs) { // ENHANCED FOR LOOP
			System.out.println("Dogs: ");
			lesChiens.printDog();
		}

	}

}
