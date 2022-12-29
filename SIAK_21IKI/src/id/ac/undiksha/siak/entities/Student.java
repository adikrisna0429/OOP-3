package id.ac.undiksha.siak.entities;

public class Student {

	private String name;
	private String id;
	private String address;
	private boolean gender;
	private String studyProgram;
	private String department;
	private String faculty;
	
	public Student() {
		this.name = "<ivalid name>";
		this.id = "<invalid nim>";
		this.faculty = "<invalid faculty>";
		this.department = "<ivalid department>";
		
		
	}
	
	public Student(String name, String id, String address, boolean gender, String studyProgram, String department,
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
		System.out.println("NIM           : " + this.id);
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
		System.out.println("Study Program : " + this.studyProgram);
		System.out.println("Department    : " + this.department);
		System.out.println("Faculty       : " + this.faculty);
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNim(String id) {
		this.id=id;
	}
	
	public String getNim() {
		return this.id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}
