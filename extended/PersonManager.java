package com.qa.person.extended;

import java.util.ArrayList;

public class PersonManager {

	public ArrayList<Person> people = new ArrayList<>();

	// used boolean object instead of void
	public boolean addPerson(Person x) {
		boolean added = people.add(x);
		return added; // like this for changing void
	}

	// used Person object rather than boolean
	public Person removePerson(int x) { // enhanced for loop
		Person removed = people.remove(x);
		return removed;
	}

	public Person find(String x, boolean ifPrint) {
		// for (int i = 0; i < people.size(); i++)

		// {
		// if (people.get(i).name == x) {

		// Person found = people.get(i);

		for (Person gens : people) { // enhanced for loop

			if (gens.name == x) {
				Person found = gens;

				// if (ifPrint == true) {
				// found.print(x);
				// }
				// return found;

				if (ifPrint) {
					gens.print();
					System.out.println("  ");
				}
				return found;

			}

		}
		System.out.println("Did not find");
		System.out.println(" ");
		return null;
	}
}
