package administration;

import java.util.Scanner;

import school.School;
import school.Student;

public class Administration {

	public static void main(String[] args) {
		
		School school = new School();
		school.fillTheListOfStudents("Jon", "Snow");
		school.fillTheListOfStudents("Tyrian", "Lanister");
		school.fillTheListOfStudents("Sansa", "Stark");
		school.fillTheListOfStudents("Robert", "Barathian");
		school.fillTheListOfStudents("Dany", "Targeryan");
		
		int[] cSharp = new int[] {3,9,9,1,6};
		int[] java = new int[] {5,6,10,4,7};
		int[] web = new int[] {8,10,10,5,8};
		
		for(int i=0; i<school.studentList.size(); i++) {
			school.makeGradesReport(school.studentList.get(i), cSharp[i], java[i],web[i]);
		}
		
		for (int i=0; i<school.studentList.size(); i++) {
			
		
		
		Student student = school.studentList.get(i);
		String name = pasakykVarda(student);
		int[] grades = getStudentsGrades (name, school);
		double average = countAverage (grades, student);
		school.setAverageAndPass(student, average);
		System.out.println(name);
		System.out.println(student.itemList);
		System.out.println(average);
		System.out.println(student.getIfPass());
		System.out.println("-----------------------------------");
		
		}
		

	}

	
	public static String pasakykVarda(Student student) {
		
		String pasisveikinimas = student.sayHello();
		int length = pasisveikinimas.length();
		int length2 = "Hello, my name is ".length();
		return pasisveikinimas.substring(length2, length);
			
		}
		
	
	public static int[] getStudentsGrades(String nameSurname, School school) {
		int cSharpGrade = school.cSharpGrades.get(nameSurname);
		int javaGrade = school.javaGrades.get(nameSurname);
		int webGrade = school.webGrades.get(nameSurname);
		int[] pazymiai = new int[] {cSharpGrade, javaGrade, webGrade};
		return pazymiai;
	
	}
	
	public static double countAverage (int[] grades, Student student) {
		int number1 = student.count(grades[0], grades[1]);
		int number2 = student.count(number1, grades[2]);
		return number2 / 3;
	}
	
	
	
}
	

	
	


