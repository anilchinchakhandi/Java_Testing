package Day_14;

class Bank
{
	double roi() {
		return 0;
	}
}

class ICICI extends Bank
{
	double roi() {
		return 10;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 11;
	}
}

public class HierorchyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank r = new Bank();
		System.out.println(r.roi());
		
		ICICI r1 = new ICICI();
		System.out.println(r1.roi());
	
		SBI s=new SBI();
		System.out.println(s.roi());

	}

}
