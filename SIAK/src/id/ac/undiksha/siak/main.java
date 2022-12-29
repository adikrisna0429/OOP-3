package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Lecture;
import id.ac.undiksha.siak.entities.Staff;
import id.ac.undiksha.siak.entities.Student;

public class main {

	public static void main(String[] args) {
		Student std1 = new Student(
				"I Kadek Bayu Danu Artha",
				"2115101025",
				"Desa Sepang Kelod, Kecamatan Busungbiu, Kabupaten Buleleng, Bali",
				true,
				"Computer Science",
				"Informatic",
				"FTK",
				"087856781591",
				"I Nyoman Saputra Wahyu Wijaya, S.Kom., M.Cs.");
		Student std2 = new Student(
				"Putu Gede Dimas Witjaksana",
				"2115101045",
				"Ubud",
				true,
				"Computer Science",
				"Informatic",
				"FTK",
				"082446800987",
				"Kadek Yota Ernanda Aryanto, S.Kom., M.T., Ph.D.");
		Student std3 = new Student(
				"Kadek Agung Kannha Wiswambara",
				"2115101043",
				"Badung",
				true,
				"Computer Science",
				"Informatic",
				"FTK",
				"081778902374",
				"Kadek Yota Ernanda Aryanto, S.Kom., M.T., Ph.D.");
		System.out.println("Data Students");
		System.out.println("   ");
		std1.printStudent();
		System.out.println("   ");
		std2.printStudent();
		System.out.println("   ");
		std3.printStudent();
		System.out.println("   ");
		System.out.println("============================================================");
		System.out.println("   ");
		
		
		Lecture lct1 = new Lecture(
				"Prof.Dr.I Kadek Bayu Danu Artha,S.Kom.,M.Cs.",
				"200304262027031004",
				"Busungbiu",
				true,
				"Computer Science",
				"Informatic",
				"FTK",
				"087856781591");
		System.out.println("Lectures Data");
		System.out.println("   ");
		lct1.printAllInfo();

		System.out.println("   ");
		System.out.println("============================================================");
		System.out.println("   ");
		
		Staff stf1 = new Staff(
				"I Kadek Bayu Danu Artha,S.Pd,. M.H.",
				"200304262027031004",
				"Busungbiu",
				true,
				"FTK",
				"Faculty Treasurer",
				"087856781591");
		System.out.println("Data Staff");
		System.out.println("   ");
		stf1.printAllInfo();
	}

}
