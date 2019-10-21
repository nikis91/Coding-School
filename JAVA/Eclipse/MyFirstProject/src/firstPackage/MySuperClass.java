package firstPackage;

public class MySuperClass {
	
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
