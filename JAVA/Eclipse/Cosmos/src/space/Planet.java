package space;

import java.util.Scanner;

public class Planet {

	private boolean rotation;
	private int howManyYears;
	
	
	
	public boolean getRotation() {
		return rotation;
	}
	
	
	public int getHowManyYears() {
		return howManyYears;
	}
	
	private String answerForRotation;
	
	private void  turnsAroundTheSun() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Does the planet turns around the sun? True or False");
		this.answerForRotation = myScanner.nextLine();
		if ("True".equals(answerForRotation)) {
			rotation = true;
		}
		else if ("False".equals(answerForRotation)) {
			rotation = false;
		}
		else {
			System.out.println("The answer is incorrect");
		}
	}
	
	
	private int answerForYears;
	
	private void years() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Insert the number for how many years does it takes");
		this.answerForYears = myScanner.nextInt();
	}
	
	
	public Planet() {
		turnsAroundTheSun();
		years();
		
	}
	
	
	public void infoAboutThePlanet() {
		System.out.println("Info about the planet: Does it goes around the Sun? " +this.rotation);
		System.out.println("It does in: " +answerForYears +"years");
			
		
	}
	
	
}
