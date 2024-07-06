package Day_09;

public class pollindrom_string {

	public static void main(String[] args) {
		String s= "abz";
		String rev="";
		boolean ans=false;
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			ans= true;
			System.out.println("it is palindrom");
		}
		else {
			System.out.println("it is not polindrom");
		}

	}

}
