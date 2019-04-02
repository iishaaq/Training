package divider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ExArrayList {

	public static void main(String[] args) {
		List<String> List = new ArrayList<>();
		
		System.out.println("Lenght is " + List.size());
		
		List.add("A");
		List.add("E");
		List.add("I");
		List.add("O");
		List.add("U");
		
		System.out.println("Lenght is " + List.size());
		
		List.remove(4);
		List.add(1, "Love");
		ListIterator<String> itr = List.listIterator();
		
		System.out.println("Inside Iterator");
		
		while(itr.hasPrevious()) {
		System.out.println(itr.previous());
		}
		
		System.out.println("Inside Iterator");
		
		
		System.out.println("Lenght is " + List.size());
		
		for (String string : List) {
			System.out.println(string);
			
		}

	}

}
