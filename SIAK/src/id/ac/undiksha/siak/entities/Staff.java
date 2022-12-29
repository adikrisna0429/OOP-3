package id.ac.undiksha.siak.entities;

public class Staff extends People{
	
	private String nip;
	private String position;
	
	public Staff(String name, String nip, String address, boolean gender,String faculty, 
			String position, String number_phone) {
		super();
		this.name = name;
		this.nip = nip;
		this.address = address;
		this.gender = gender;
		this.faculty = faculty;
		this.position = position;
		this.number_phone = number_phone;
	}

	public void printAllInfo() {
		
		System.out.println("Name          : " + this.name);
		System.out.println("NIP           : " + this.nip);
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
		System.out.println("Faculty       : " + this.faculty);
		System.out.println("Position      : " + this.position);
		System.out.println("Number Phone  : " + this.number_phone);
	}
}
