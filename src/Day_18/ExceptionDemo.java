package Day_18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int number= sc.nextInt() ;
		
		// System.out.println(100/number);   //ArithmeticException 
		
		// Handling the exception
		try {
			System.out.println(100/number);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("You entered into a finally block");
		}
		
		System.out.println("Program end");

	}

}
