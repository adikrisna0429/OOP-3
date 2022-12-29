package id.ac.undiksha.siak.entitis;


public class Staff extends People{
	
	private String nip;
	private String position;
	private String faculty;
	private String number_phone;
	
	public Staff() {
		this.nip = "<ivalid NIP>";
		this.faculty = "<invalid faculty>";
		this.position = "<ivalid Position>";
		this.number_phone = "<invalid Number Phone>";
	}
	public Staff(String nip,String faculty, String position, String number_phone) {
		super();
		this.nip = nip;
		this.faculty = faculty;
		this.position = position;
		this.number_phone = number_phone;
	}
	
	public Staff(String name, String address, boolean gender, String nip,String faculty, String position, String number_phone) {
		super(name, gender, address);
		this.nip = nip;
		this.faculty = faculty;
		this.position = position;
		this.number_phone = number_phone;
	}

	public void printStaff() {
		
		System.out.println("Name          : " + this.name);
		System.out.println("NIP           : " + this.nip);
		System.out.println("Address       : " + this.address);
		System.out.println("Gender        : " + (gender ? "Male" : "Female"));
		System.out.println("Faculty       : " + this.faculty);
		System.out.println("Position      : " + this.position);
		System.out.println("Number Phone  : " + this.number_phone);
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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
