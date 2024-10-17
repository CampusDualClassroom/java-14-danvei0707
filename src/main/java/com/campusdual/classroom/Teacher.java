package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void getDetails(){
		StringBuilder msg = this.getNameBuilder();
		msg.insert(0, "\nTEACHER: ");
		msg.append("\n\t Area: ");
		msg.append(this.area);

		System.out.println(msg.toString());
	}
}
