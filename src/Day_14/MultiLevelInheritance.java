package Day_14;

class Animal
{
	void display(int a)
	{
		System.out.println(a);
	}
}

class Dog extends Animal
{
	void show(int b) {
		System.out.println(b);
	}
}

class cat extends Dog
{
	void measure(int a,int b) {
		System.out.println(a*b);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		cat c= new cat();
		c.display(10);
		c.show(20);
		c.measure(10, 20);
	}

}

