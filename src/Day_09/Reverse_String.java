package Day_09;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Approach 1:using string methods
		String s ="welcome";
		String rev= "";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);	
		}
		System.out.println(rev);
		
		// Approach: convert the string into char array
		
		
		String s1="spiderman";
		String rev1= "";
		char a[]=s1.toCharArray();
		for(int c=a.length-1;c>=0;c--) {
			rev1=rev1+a[c];	
		}
		System.out.println(rev1);
		
		// Approach 3: using stringBuffer 
		
		StringBuffer s2 = new StringBuffer("batman");
		System.out.println(s2.reverse());
		
		//Approach4: StringBuilder 
		StringBuilder s3 = new StringBuilder("catman");
		System.out.println(s3.reverse());
	}

}
