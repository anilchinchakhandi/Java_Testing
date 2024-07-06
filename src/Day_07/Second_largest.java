package Day_07;

public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,50,90};
		int first_max=a[0];
		int second_max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>first_max) {
				second_max=first_max;
				first_max=a[i];
				
			}
			else if(a[i]>second_max && a[i]!=second_max) {
				second_max=first_max;
				
			}
		}
		
		System.out.println(second_max);

	}

}
