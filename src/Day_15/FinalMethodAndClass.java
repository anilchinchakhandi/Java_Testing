package Day_15;

final class Test1
{
	final void m(int a)
	{
		System.out.println(a);
	}
}

class Test2 extends Test1// error final keyword in class 
{
	void m(int a, int b) // It is error because of final keyword of method
	{
		System.out.println(a*b);//overriding
	}
}

public class FinalMethodAndClass {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.m(10, 20);

	}

}
