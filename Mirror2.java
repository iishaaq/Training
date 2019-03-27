
import java.util.Scanner;
import java.util.*;

class Mirror2 {


public static void main (String [] args){

System.out.println ("Please enter the list of keys");

Scanner input = new Scanner(System.in);
String  str = input.nextLine();
//System.out.println (str);
String [] results =  str.split("");

/*
for (int i= 0; i<results.length; i++){
System.out.println (results[i]);

}
*/
ArrayList array1 =new ArrayList();
StringBuilder  answer = new  StringBuilder("");
int inc = 0;
for (int x=0; x<=results.length-1; x++){

	if (results[x].equals(results[x+1])){
		answer.append(results[x]);
		int y = x-1;
		int z = x+2;
		int count = 1;
		
		while(y>0 || z<results.length){
		
		if(results[y].equals(results[z])){
			answer.append(results[y]);
			//System.out.println (answer);
			//count++;
						
			}
		else
			break;
		
		}
		
		array1.add(answer);
		System.out.println(array1.get(0));
		answer.setLength(0);
		y--;
		z++;

	}
	else
		continue;


}

//System.out.println("Sodappal");

for (int m=0; m<array1.size()-1; m++){
System.out.println("Sodappal");
}


}






}
