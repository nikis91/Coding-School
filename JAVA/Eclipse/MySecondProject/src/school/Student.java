package school;

import java.util.*;

public class Student {
	protected String nameSurname;
	public List<String> itemList = new ArrayList<String>();
	private double marksAverage;
	private boolean ifPass;
	
	public Student (String name, String lastName) {
		this.nameSurname = name + " " + lastName;
	}
	


public int count (int number1, int number2) {
	return number1 + number2;
}

public String sayHello () {
	System.out.println("Hello, my name is " +this.nameSurname);
	return "Hello, my name is " +this.nameSurname;
}

public void setMarksAverage (double average) {
	this.marksAverage = average;
}

public void setIfPass (boolean passed) {
	this.ifPass = passed;
}

public double getMarksAverage() {
	return this.marksAverage;
}

public boolean getIfPass() {
	return this.ifPass;
}







}



