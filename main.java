package main;

public class main {

	public static void main(String[] args) {

		System.out.println("I am inside the main method");
		main.main(args[0],args[1]);

	}
	
	public static void main(String a, String b) {

		System.out.println("I am inside the second method" +" "+ a + " "+ b);

	}

}
