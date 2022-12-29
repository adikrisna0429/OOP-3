package id.ac.undiksha.siak.entities;

public abstract class People {

	protected String name;
	protected  String address;
	protected  boolean gender;
	protected  String department;
	protected  String faculty;
	protected String number_phone;
	
	public People() {
		this.name = "<ivalid name>";
		this.faculty = "<invalid faculty>";
		this.department = "<ivalid department>";
		this.number_phone = "<ivalid number phone>";
	}
	
	public People(String name,String address, boolean gender,String department, String faculty, String number_phone) 
	{
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.department = department;
		this.faculty = faculty;
		this.number_phone = number_phone;
		
	}

	public void printAllInfo() {
		
		System.out.println("Name          : " + this.name);;
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
		System.out.println("Department    : " + this.department);
		System.out.println("Faculty       : " + this.faculty);
		System.out.println("Number Phone  : " + this.number_phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getNumber_phone() {
		return number_phone;
	}

	public void setNumber_phone(String number_phone) {
		this.number_phone = number_phone;
	}
	
}
