package Day_18;

public class NumberConversionExcption {

	public static void main(String[] args) {
			
		System.out.println("Program started");
		try 
		{
		String s = null;
		int a = Integer.parseInt(s); // NumberFormatException
		System.out.println(a);
		
		}
		catch(NullPointerException e) {
			System.out.println("hi");
		}
		
		catch(Exception e) {
			
			System.out.println("Hello");
		}
		System.out.println("Lovely");

	}

}
