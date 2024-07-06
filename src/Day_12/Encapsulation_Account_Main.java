package Day_12;

public class Encapsulation_Account_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation_Account ac = new Encapsulation_Account();
		ac.setAccount_no(101);
		System.out.println(ac.getAccount_no());
		
		ac.setName("Anil");
		System.out.println(ac.getName());
		
		ac.setBalance(100000.00);
		System.out.println(ac.getBalance());
	}

}
