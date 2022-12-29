package id.ac.undiksha.siak.entities;

public class Lecture extends People{

	private String nip;
	private String studyProgram;
	
	public Lecture(String name, String nip, String address, boolean gender, String studyProgram, String department,
			String faculty, String number_phone) {
		super();
		this.name = name;
		this.nip = nip;
		this.address = address;
		this.gender = gender;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
		this.number_phone = number_phone;
	}
		public void printAllInfo() {
		
		System.out.println("Name          : " + this.name);
		System.out.println("NIP           : " + this.nip);
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
		System.out.println("Department    : " + this.department);
		System.out.println("Faculty       : " + this.faculty);
		System.out.println("Study Program : " + this.studyProgram);
		System.out.println("Number Phone  : " + this.number_phone);
	}
}
