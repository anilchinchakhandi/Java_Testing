package Day_15;

class Test
{
	final int x=100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		Test t = new Test();
		
//		t.x=200;   // It is error because when we use final keyword to variable we cannot change the variable value
		System.out.println(t.x);

			

	}

}
