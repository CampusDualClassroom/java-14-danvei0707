package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	@Override
	public void getDetails(){
		StringBuilder msg = this.getNameBuilder();
		msg.insert(0, "\nDOCTOR: ");
		msg.append("\n\t Specialty: ");
		msg.append(this.specialization);

		System.out.println(msg.toString());
	}
}
