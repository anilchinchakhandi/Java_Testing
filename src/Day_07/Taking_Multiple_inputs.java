package Day_07;

import java.util.Arrays;
import java.util.Scanner;

public class Taking_Multiple_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter array element with position"+i);
			
	
		}
		System.out.println(Arrays.toString(a));
		
	}

}
