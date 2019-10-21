package egzaminoUzduotis;

import java.util.Scanner;

public class FigurosPasirinkimas {
	
	private int figura;
	
	
	private double krastine1;
	private double krastine2;
	private double spindulys;
	
	
	
	public int getFigura() {
		return figura;
	}
	public double getKrastine1() {
		return krastine1;
	}
	public double getKrastine2() {
		return krastine2;
	}
	public double getSpindulys() {
		return spindulys;
	}
	
	
	
	public void chooseFigure() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Kurios figuros plota skaiciuoti? - Staciakampis 1, Statusis trikampis 2, Kvadratas 3, Spindulys 4");
		
	
		this.figura = myScanner.nextInt();
		
		if (figura < 3) {
			System.out.println("Iveskite pirmosios krastines ilgi");
			
			this.krastine1 = myScanner.nextDouble();
			
			
			System.out.println("Iveskite antrosios krastines ilgi");
			
			this.krastine2 = myScanner.nextDouble();
			
		}
		
		else if (figura == 3) {
			
			System.out.println("Iveskite kvadrato krastines ilgi");

			this.krastine1 = myScanner.nextDouble();
		}
		
		else if (figura == 4) {
			
			System.out.println("Iveskite skritulio spindulio ilgi");
			
			this.spindulys = myScanner.nextDouble();
		}
		
		
		
			
		
	}
	
	

}
