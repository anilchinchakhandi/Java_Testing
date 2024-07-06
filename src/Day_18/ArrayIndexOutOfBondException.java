package Day_18;

import java.util.Scanner;

public class ArrayIndexOutOfBondException {

	public static void main(String[] args) {
		 System.out.println("Program satrted ..............");
		 
		 int a[]=new int[5];
		 
		 Scanner sc = new Scanner(System.in);
		 
		try
		{
		 System.out.println("Enter the position : ");
		 int pos = sc.nextInt();
		 
		 System.out.println("Enter the value: ");
		 int value = sc.nextInt();
		 
		 a[pos]=value;
		 // a[5]=500; ArrayIndexOutOfBoundsException
		}
		catch(Exception e) {
			System.out.println("Exception handled");
			
		}
		 
		 
		 System.out.println("Program ended..............");
		 
	}

}
