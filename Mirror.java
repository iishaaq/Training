
import java.util.Scanner;
import java.util.*;

class Mirror {


public static void main (String [] args){

System.out.println ("Please enter the list of keys");

Scanner input = new Scanner(System.in);
String  str = input.nextLine();
System.out.println (str);
String [] results =  str.split("");

/*
for (int i= 0; i<results.length; i++){
System.out.println (results[i]);

}
*/
ArrayList array1 =new ArrayList();
StringBuilder  answer = new  StringBuilder("");
int inc = 0;
for (int x=2; x<results.length-1; x++){

	if (results[x].equals(results[x+1])){

		for(int y = x; y>=0; y--){
		
		for(int z = ++x; z<results.length-1; z++){
			if(results[y].equals(results[z])){
			answer.append(results[z]);	
			System.out.println(answer);
		
		   }
			
		
		}
			array1.add(answer);
			answer.setLength(0);
			break;
		}


	}

	else
 	continue;

}

for (int m=0; m<array1.size(); m++){
System.out.println(array1.get(m));
}
}






}
