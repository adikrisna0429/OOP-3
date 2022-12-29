package id.ac.undiksha.siak.entities;

public class Lecture {
	

	private String name;
	private String id;
	private String address;
	private boolean gender;
	private String studyProgram;
	private String department;
	private String faculty;
	
	public Lecture() {
		this.name = "<ivalid name>";
		this.id = "<invalid nim>";
		this.faculty = "<invalid faculty>";
		this.department = "<ivalid department>";
		
		
	}
	
	public Lecture(String name, String id, String address, boolean gender, String studyProgram, String department,
			String faculty) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.gender = gender;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
	}

	public void printAllInfo() {
		
		System.out.println("Name          : " + this.name);
		System.out.println("NIP           : " + this.id);
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
		System.out.println("Study Program : " + this.studyProgram);
		System.out.println("Department    : " + this.department);
		System.out.println("Faculty       : " + this.faculty);
	}
}
