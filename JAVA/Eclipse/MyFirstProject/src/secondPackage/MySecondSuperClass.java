package secondPackage;

import java.util.Scanner;

import firstPackage.MySuperClass;

public class MySecondSuperClass {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter first digit");
		
		int firstNumber = myScanner.nextInt();
		
		System.out.println("Enter second digit");
		
		int secondNumber = myScanner.nextInt();
		
//		MySuperClass objectSample = new MySuperClass();
		
		
//		objectSample.doFizzBuzz(firstNumber, secondNumber);
		
		
//		System.out.println(firstNumber);
//		System.out.println(secondNumber);
		
		doFizzBuzz(firstNumber, secondNumber);

	}
	
public static void doFizzBuzz (int number1, int number2) {
		
		for (int i = number1; i <= number2; i ++) {
		 
			
		  if (i % 3 == 0 && i % 5 == 0)
		  {
		    System.out.println("FIZZBUZZ");
		  }
		  else if (i % 5 == 0 )
		  {
		    System.out.println("BUZZ");
		  }
		  else if (i % 3 == 0)
		  {
		    System.out.println("FIZZ");
		  }
		  else
		  {
		    System.out.println(i);
		  }
		}
}
}
		
