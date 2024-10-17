package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;
	protected StringBuilder nameBuilder;

	protected StringBuilder getNameBuilder(){
		StringBuilder str = new StringBuilder();
		str.append(this.name);
		str.append(" ");
		str.append(this.surname);

		return str;
	}

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.nameBuilder = getNameBuilder();
	}

	public void getDetails(){
		StringBuilder msg = this.nameBuilder;
		msg.insert(0, "\nPERSON: ");

		System.out.println(msg.toString());
	}
}
