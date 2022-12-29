package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecture;
import id.ac.undiksha.siak.entities.Staff;

public class main {

	public static void main(String[] args) {
		Student std1 = new Student(
				"I Kadek Bayu Danu Artha",
				"2115101025",
				"Busungbiu",
				true,
				"Computer Science",
				"Informatic",
				"FTK");
		System.out.println("Data Students");
		System.out.println("   ");
		std1.printAllInfo();
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
				"FTK");
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
				"Informatic",
				"FTK",
				"Faculty Treasurer");
		System.out.println("Data Staff");
		System.out.println("   ");
		stf1.printAllInfo();
	}

}
