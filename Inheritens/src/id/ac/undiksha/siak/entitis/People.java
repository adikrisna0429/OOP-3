package id.ac.undiksha.siak.entitis;

public abstract class People {
	protected String name;
	protected String address;
	protected boolean gender;

	public People() {
		this.name = "<ivalid name>";
		this.address = "<invalid faculty>";
	}
	public People(String name, boolean gender, String address) {
		this.name = name;
		this.address = address;
		this.gender = gender;
	}
	public void printAllInfo() {
		
		System.out.println("Name          : " + this.name);;
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
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
	
}
