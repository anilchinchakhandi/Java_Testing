package Day_06;

public class Even_Odd_Number_Array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int even_array=0,odd_array=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even_array++;
			}
			else {
				odd_array++;
				
			}
		}
		System.out.println(even_array);
		System.out.println(odd_array);
	}

}
