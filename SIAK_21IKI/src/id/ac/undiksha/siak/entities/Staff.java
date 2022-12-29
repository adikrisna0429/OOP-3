package id.ac.undiksha.siak.entities;

public class Staff {

	private String name;
	private String id;
	private String address;
	private boolean gender;
	private String department;
	private String faculty;
	private String position;
	
	public Staff() {
		this.name = "<ivalid name>";
		this.id = "<invalid nim>";
		this.faculty = "<invalid faculty>";
		this.department = "<ivalid department>";
	}
	
	public Staff(String name, String id, String address, boolean gender, String department,
			String faculty, String position) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.gender = gender;
		this.department = department;
		this.faculty = faculty;
		this.position = position;
	}

	public void printAllInfo() {
		
		System.out.println("Name          : " + this.name);
		System.out.println("NIP           : " + this.id);
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
		System.out.println("Department    : " + this.department);
		System.out.println("Faculty       : " + this.faculty);
		System.out.println("Position      : " + this.position);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
