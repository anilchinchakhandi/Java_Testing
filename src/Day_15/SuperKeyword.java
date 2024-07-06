package Day_15;

class Animal
{
	String color = "white";
}

class Dog extends Animal
{
	String color = "Black";     //override
	void displaycolor()
	{
		System.out.println(super.color);   //super keyword invoke the immediate parent class variable and method
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog c = new Dog();
		c.displaycolor();

	}

}
