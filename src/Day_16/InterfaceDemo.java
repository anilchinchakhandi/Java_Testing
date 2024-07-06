package Day_16;

interface shape
{
	int length =10;  // final and static variable
	int width =20;  // final and static variable
	
	void circle();
	
	default void squire() {     // default abstract method 
		System.out.println("It is a squire");
	}
	
	static void rectangle() {   // static abstract method
		System.out.println("It is rectangle");
	}
}



public class InterfaceDemo implements shape {
	public void circle() {
		System.out.println("it is a circle");
	}

	public static void main(String[] args) {
		
		InterfaceDemo obj = new InterfaceDemo();
		obj.circle();   // abstarct
		obj.squire(); // default
	    shape.rectangle(); // static without creating object
	    
	    
	    shape i = new InterfaceDemo();
	    i.circle();
	    i.squire();
	    shape.rectangle();

	}

}
