package Day_07;

public class Repeatation_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {10,20,30,40,30,50,30,20};
		int duplicate_Number = 20;
		int count=0;
		for(int number:num) {
			if(number == duplicate_Number) {
				System.out.println(number);
				count++;	
			}
			
		}
		
		System.out.println(count);
	}

}
