package divider;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		long x= 1000*30*2*15*4*24*365L;
		long y= 1000*30*2*15*4*24*365;
		System.out.println("x "+x);
		System.out.println("y "+y);
		long z= x-y;
		System.out.println(x-y);
		System.out.println(z);
		//Human m = new Man();
		//((Man) m).go();
		
		System.out.println("Please enter a value");
		
		Scanner input = new Scanner(System.in);
		try {
		int input1 = input.nextInt();
		
		if(input1>=0 && input1<=1000) {
			
			if(input1%3==0 && String.valueOf(input1).contains("3") ) {
				System.out.println("Dumb");
			}
			else if(input1%3==0) {
				System.out.println("Idiot");
			}
			else if(String.valueOf(input1).contains("3")) {
				System.out.println("Stupid");
			}
			else
				System.out.println("Smart");
		}
		else
			System.out.println("Invalid");
		} 
		
		catch (Exception e) {
			System.out.println("Please insert a valid input");
		}
	}

}
