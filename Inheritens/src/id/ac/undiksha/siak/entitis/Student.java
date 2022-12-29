package id.ac.undiksha.siak.entitis;

import id.ac.undiksha.organization.StudyProgram;

public class Student extends People{

	private String nim;
	private String number_phone;
	private String academic_counselors;
	private StudyProgram studyProgram;
	
	public StudyProgram getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}

	public Student() {
		this.nim = "<ivalid NIM>";
		this.academic_counselors = "<ivalid Academic Counselors>";
		this.number_phone = "<invalid Number Phone>";
		this.studyProgram = new StudyProgram();
	}
	public Student(String nim,String number_phone, String academic_counselors) {
		super();
		this.nim = nim;
		this.number_phone = number_phone;
		this.academic_counselors = academic_counselors;
	}
	
	public Student(String name, String nim, String address, boolean gender, String studyProgramname, String studyProgramdepartment,
			String studyProgramfaculty, String number_phone, String academic_counselors) {
		super(name,gender,address);
		this.name = name;
		this.nim = nim;
		this.address = address;
		this.studyProgram.setStudyProgramname(studyProgramname);
		this.studyProgram.setStudyProgramdepartment(studyProgramdepartment);
		this.studyProgram.setStudyProgramfaculty(studyProgramfaculty);
		this.number_phone = number_phone;
		this.academic_counselors = academic_counselors;
	}

		public void printStudent() {
		
		System.out.println("Name                 : " + this.name);
		System.out.println("NIM                  : " + this.nim);
		System.out.println("Address              : " + this.address);
		System.out.println("Gender               : " + (gender ? "Male" : "Female"));
		System.out.println("Academic Counselors  : " + this.academic_counselors);		
		System.out.println("Department           : " + this.getStudyProgram().getStudyProgramdepartment());
		System.out.println("Faculty              : " + this.getStudyProgram().getStudyProgramfaculty());
		System.out.println("Study Program        : " + this.getStudyProgram().getStudyProgramname());

	}

		public String getNim() {
			return nim;
		}

		public void setNim(String nim) {
			this.nim = nim;
		}

		public String getNumber_phone() {
			return number_phone;
		}


		public void setNumber_phone(String number_phone) {
			this.number_phone = number_phone;
		}
		public String getAcademic_counselors() {
			return academic_counselors;
		}
		public void setAcademic_counselors(String academic_counselors) {
			this.academic_counselors = academic_counselors;
		}
	
}
