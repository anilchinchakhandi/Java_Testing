package Assignment;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 121, rev=0, rem;
		
		int temp=num;
		
		while(num>0) {
			rem = num %10;
			rev = rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Number is polindrom");
		}
		else {
			System.out.println("Given number is not polindrom");
		}
	}

}
