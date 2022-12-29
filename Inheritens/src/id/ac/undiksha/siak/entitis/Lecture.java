package id.ac.undiksha.siak.entitis;

public class Lecture extends People{

	private String nip;
	private String studyProgram;
	private String department;
	private String faculty;
	private String number_phone;
	

	public Lecture() {
		this.nip = "<ivalid NIP>";
		this.faculty = "<invalid faculty>";
		this.department = "<ivalid department>";
		this.studyProgram = "<invalid Program Study>";
		this.number_phone = "<invalid Number Phone>";
	}
	public Lecture(String nip, String studyProgram, String department,String faculty, String number_phone) {
		super();
		this.nip = nip;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
		this.number_phone = number_phone;
	}
	
	public Lecture(String name, String nip, String address, boolean gender, String studyProgram, String department,
			String faculty, String number_phone) {
		super(name,gender,address);
		this.nip = nip;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
		this.number_phone = number_phone;
	}
		public void printLecture() {
		
		System.out.println("Name          : " + this.name);
		System.out.println("NIP           : " + this.nip);
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
		System.out.println("Department    : " + this.department);
		System.out.println("Faculty       : " + this.faculty);
		System.out.println("Study Program : " + this.studyProgram);
		System.out.println("Number Phone  : " + this.number_phone);
	}
		public String getNip() {
			return nip;
		}
		public void setNip(String nip) {
			this.nip = nip;
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
		public String getNumber_phone() {
			return number_phone;
		}
		public void setNumber_phone(String number_phone) {
			this.number_phone = number_phone;
		}
	
}
