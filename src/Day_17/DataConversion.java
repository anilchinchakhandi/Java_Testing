package Day_17;

public class DataConversion {
	public static void main(String[] args) {
		 
		String s= "123";
		
		
		// String to integer
		int i = Integer.parseInt(s);
		System.out.println(i); 
		
		// String Double
		double d= Double.parseDouble(s);
		System.out.println(d);
		
		
		// String to boolean 
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		// String to short
		Short s1 = Short.parseShort(s);
		System.out.println(s1);
		
		
		// primitive to String Convention
		
		int a =10;
		double d1 = 10.0;
		char c = 'A';
		boolean bo = true;
		
		String s2 = String.valueOf(a);
		System.out.println(s2);
		
		s2=String.valueOf(d1);
		System.out.println(s2);
		
		s2=String.valueOf(c);
		System.out.println(s2);
		
		s2=String.valueOf(bo);
		System.out.println(s2);
		
		

	}

}
