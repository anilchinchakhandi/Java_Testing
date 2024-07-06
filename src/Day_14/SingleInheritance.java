package Day_14;

class parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class child1 extends parent 
{
	void show(int b) {
		System.out.println(b);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		child1 c= new child1();
		c.display(10);
		c.show(20);

	}

}


