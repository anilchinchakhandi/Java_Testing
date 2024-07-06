package Day_06;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {
		
		// Declaration of an array
		
		// Approach 1
		/*int a[][]= new int[3][2];
		
		a[0][1]=100;
		a[0][2]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		// Approach 2
		
		int a[][]= { {100,200},{300,400},{500,600}};
		
		// Find the row length of an array
		
		/*System.out.println(a.length);
		
		// Find the column length of an array
		
		System.out.println(a[0].length);
		
		// Read the single value of an array
		
		System.out.println(a[1][0]);
		
		// Read all the value from an array*/
//		
//		for(int r=0;r<a.length;r++) {
//			for(int c=0;c<a[r].length;c++) {
//				System.out.print(a[r][c]+ "  ");
//			}
//			System.out.println();
//		}	
		
		// enhance for loop 
		
		for (int arr[]:a) {
			for(int x:arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
