package Day_15;

class ABC
{
	void m1(int a) 
	{
	 System.out.println(a);	
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
	
}

class XYZ extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a); // overriding
	}
	
	void m2(int a,int b) // Overloading
	{
		System.out.println(a+b);
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		XYZ obj = new XYZ();
		obj.m1(10);
		obj.m2(20);
		obj.m2(10,20);

	}

}
