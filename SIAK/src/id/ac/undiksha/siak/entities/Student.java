package id.ac.undiksha.siak.entities;

public class Student extends People{

	private String nim;
	private String studyProgram;
	private String academic_counselors;
	
	public Student(String name, String nim, String address, boolean gender, String studyProgram, String department,
			String faculty, String number_phone, String academic_counselors) {
		super();
		this.name = name;
		this.nim = nim;
		this.address = address;
		this.gender = gender;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
		this.number_phone = number_phone;
		this.academic_counselors = academic_counselors;
	}
		public void printStudent() {
		
		System.out.println("Name                 : " + this.name);
		System.out.println("NIM                  : " + this.nim);
		System.out.println("Address              : " + this.address);
		System.out.println("Gender               : " + (gender ? "Male" : "Female"));
		System.out.println("Department           : " + this.department);
		System.out.println("Faculty              : " + this.faculty);
		System.out.println("Study Program        : " + this.studyProgram);
		System.out.println("Number Phone         : " + this.number_phone);
		System.out.println("Academic Counselors  : " + this.academic_counselors);
	}

}
