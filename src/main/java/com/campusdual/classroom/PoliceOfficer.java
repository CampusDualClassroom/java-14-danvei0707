package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public void getDetails(){
		StringBuilder msg = this.getNameBuilder();
		msg.insert(0, "\nPOLICE OFFICER: ");
		msg.append("\n\t Squad: ");
		msg.append(this.squad);

		System.out.println(msg.toString());
	}
}
