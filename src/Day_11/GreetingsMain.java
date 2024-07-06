package Day_11;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings gr = new Greetings();
		gr.m1();
		
		String s=gr.m2();
		System.out.println(s);
		
		gr.m3(" "+"Anil");
		
		String s1 = gr.m4("Anil");
		System.out.println(s1);

	}

}
