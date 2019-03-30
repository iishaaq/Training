package hop;

import java.util.Scanner;

public class hop {

	public static void main(String[] args) {
		
		System.out.println("Please enter the Distance");
		
		Scanner scr = new Scanner(System.in);
		try {
		int question = scr.nextInt();
		
		
		int rest = 0;
		int hop = 0;
		int count = 1;
		
		//System.out.println("hop = " + hop + " rest = " + rest);
		
		while(question>0) {
			if(count == 1) {
				if(question>8) {
				hop++;
				count++;
				rest += 5;
				question -= 8;
				
				}
				else {
					hop++;
					question =0;
				}
			}
			else if(count == 2) {
				if(question>5) {
					hop++;
					count++;
					rest += 3;
					question -= 5;
					
					}
					else {
						hop++;
						question =0;
					}
				
			}
			else if(count == 3) {
				if(question>2) {
					hop++;
					count++;
					rest += 2;
					question -= 2;
					
					}
					else {
						hop++;
						question =0;
					}
				
			}
			else{
				count++;
				hop++;
				rest += 2;
				question -= 2;
					
			}
		}
		
		System.out.println("hop count = " + hop + " Total rest = " + rest+"s");
		
		}
		catch(Exception e){
			System.out.println("Please Enter a valid distance");
		}
	
	}

}
