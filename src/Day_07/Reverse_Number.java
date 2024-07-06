package Day_07;

import java.util.Arrays;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int a[]= {10,20,50,40,30};
		Arrays.sort(a);
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
