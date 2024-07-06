package Day_12;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder addobj = new Adder();
		addobj.sum();
		
		addobj.sum(10,30.1);
		
		addobj.sum(20.0,50);
		
		addobj.sum(10,20,50);
		
	}

}
