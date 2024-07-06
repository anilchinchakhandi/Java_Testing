package Day_07;

import java.util.Arrays;

public class Sorting_Element_Array {

	public static void main(String[] args) {
		
		int num[]= {100,600,500,800,300,200,700,400};
		int temp=0;
		
		System.out.println("Before sorting");
		
		System.out.println(Arrays.toString(num));
//		
//		Arrays.sort(num);
//		
//		System.out.println("after sorting");
//		
//		System.out.println(Arrays.toString(num));
		System.out.println("After sorting: ");
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
				}
				
				
			}
			
			System.out.print(num[i]+" , ");
		}
		
		

	}

}
