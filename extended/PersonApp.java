package com.qa.person.extended;

public class PersonApp {

	public static void main(String[] args) {
		Person person = new Person();
		PersonManager personManager = new PersonManager();

		person.addCat(new Cat("Mr Tiddles", 3, "Tabby"));
		person.addCat(new Cat("Mildred", 10, "Black"));
		person.addCat(new Cat("Bailey", 5, "Rainbow"));

		person.removeCat(0);

		person.addDog(new Dog("Woody", 2, "Golden"));
		person.addDog(new Dog("Cookie", 4, "Chocolate and Tan"));
		person.addDog(new Dog("Doris", 6, "dapple"));

		person.removeDog(0);

		personManager.addPerson(new Person("Harry", 24, "Chef"));
		personManager.addPerson(new Person("Adam", 34, "Builder"));
		personManager.addPerson(new Person("Amy", 43, "Lawyer"));
		personManager.addPerson(new Person("Aaron", 32, "Police Officer"));

		personManager.find("Adam", false).addCat(new Cat("Mr Tiddles", 3, "Tabby"));
		personManager.find("Harry", false).addDog(new Dog("Cookie", 4, "Chocolate and Tan"));

		personManager.removePerson(0);

		personManager.find("Amy", true);
		personManager.find("Adam", true);

	}

}