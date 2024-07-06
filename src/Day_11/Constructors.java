package Day_11;

public class Constructors {
	
	int x,y;
	
	Constructors(){   // default constructors
		 x = 200;
		 y = 300;
		
	}
	
	Constructors(int a,int b){ // Parameterize constructor
		x=a;
		y=b;
		
	}
	void Sum() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Constructors c = new Constructors();  //default constructors
//		c.Sum();
//		
		Constructors c = new Constructors(600,800);
		c.Sum();

	}

}
