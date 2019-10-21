package school;

import java.util.*;

public class School {
public List<Student> studentList = new ArrayList<Student>();
public Map<String, Integer> cSharpGrades = new HashMap<String, Integer>();
public Map<String, Integer> javaGrades = new HashMap<String, Integer>();
public Map<String, Integer> webGrades = new HashMap<String, Integer>();

public School () {
	
}

public void fillTheListOfStudents (String name, String lastName) {
	Student student = new Student (name, lastName);
	student.itemList.add("C#");
	student.itemList.add("Java");
	student.itemList.add("Web");
	this.studentList.add(student);
	
}

public void makeGradesReport (Student student, int cSharpGrade, int javaGrade, int webGrade) {
	this.cSharpGrades.put(student.nameSurname, cSharpGrade);
	this.javaGrades.put(student.nameSurname, javaGrade);
	this.webGrades.put(student.nameSurname, webGrade);
}

public void setAverageAndPass(Student student, double averageGrade) {
	student.setIfPass(true);
	if(averageGrade >= 5) {
		student.setIfPass(true);
	}
	else {
		student.setIfPass(false);
	}
}



}
