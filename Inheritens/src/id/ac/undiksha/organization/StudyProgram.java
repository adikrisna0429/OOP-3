package id.ac.undiksha.organization;

public class StudyProgram {
	
	private String studyProgramname;
	private String studyProgramdepartment;
	private String studyProgramfaculty;
	
	public StudyProgram(String studyProgramname, String studyProgramdepartment, String studyProgramfaculty) {
		super();
		this.studyProgramname = studyProgramname;
		this.studyProgramdepartment = studyProgramdepartment;
		this.studyProgramfaculty = studyProgramfaculty;
	}

	public StudyProgram() {
		this.studyProgramname = "<ivalid NIM>";
		this.studyProgramdepartment = "<ivalid Academic Counselors>";
		this.studyProgramfaculty = "<invalid Number Phone>";
	}
	
	public String getStudyProgramname() {
		return studyProgramname;
	}



	public void setStudyProgramname(String studyProgramname) {
		this.studyProgramname = studyProgramname;
	}



	public String getStudyProgramdepartment() {
		return studyProgramdepartment;
	}



	public void setStudyProgramdepartment(String studyProgramdepartment) {
		this.studyProgramdepartment = studyProgramdepartment;
	}



	public String getStudyProgramfaculty() {
		return studyProgramfaculty;
	}



	public void setStudyProgramfaculty(String studyProgramfaculty) {
		this.studyProgramfaculty = studyProgramfaculty;
	}


}