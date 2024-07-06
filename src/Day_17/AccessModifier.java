package Day_17;

public class AccessModifier {
	
	private int x = 100;
	
	private void m() {
		System.out.println("this is m1....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier a=new AccessModifier();
		System.out.println(a.x);
		a.m();

	}

}
