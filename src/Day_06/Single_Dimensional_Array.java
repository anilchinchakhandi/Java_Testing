package Day_06;

public class Single_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration of array 
		// Approach 1
		int a[]= new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		// Approach 2
		int b[]= {100,200,300,400,500};
		
		// Find the length of an array.
		System.out.println(b.length);
		
		// Read the single value from an array.
		System.out.println(b[3]);
		
		// Read the all the values from the array.
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
	}

}
