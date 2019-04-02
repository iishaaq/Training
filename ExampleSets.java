package divider;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleSets {

	public static void main(String[] args) {
		Set <String> sets = new HashSet<>();
		sets.add("h");
		sets.add("n");
		sets.add("l");
		sets.add("q");
		sets.add("a");
		sets.add("z");
		
		Set <String> sets1 = new TreeSet<>();
		sets1.add("h");
		sets1.add("n");
		sets1.add("l");
		sets1.add("q");
		sets1.add("a");
		sets1.add("z");
		
		Set <String> sets2 = new LinkedHashSet<>();
		sets2.add("h");
		sets2.add("n");
		sets2.add("l");
		sets2.add("q");
		sets2.add("a");
		sets2.add("z");
		
		System.out.println(sets);
		System.out.println(sets1);
		System.out.println(sets2);
		
		
		for (String string : sets) {
			System.out.println(string);
		}
		
		System.out.println("........................................");
		
		for (String string : sets1) {
			System.out.println(string);
		}
		
		System.out.println("........................................");
		
		for (String string : sets2) {
			System.out.println(string);
		}

	}

}
