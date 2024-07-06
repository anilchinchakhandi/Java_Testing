package Day_07;
public class Largest_Number {
	public static void main(String[] args) {
		
		int arr[]= {10,20,5,1,40};
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println(min);
		
	}

}
