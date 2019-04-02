package divider;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String,Integer> maps = new HashMap<>();
		maps.put("Chathu", 100);
		maps.put("Amanda", 120);
		maps.put("Baghya", 70);
		
		Map<String,Integer> maps2 = new LinkedHashMap<>();
		maps2.put("Chathu", 100);
		maps2.put("Amanda", 120);
		maps2.put("Baghya", 70);
		
		Map<String,Integer> maps3 = new TreeMap<>();
		maps3.put("Chathu", 100);
		maps3.put("Amanda", 80);
		maps3.put("Baghya", 70);
		
		
		
		
		System.out.println("....................................");
		
		for(Map.Entry<String, Integer> entry : maps2.entrySet()) {
			System.out.println("Key is " +entry.getKey() + " Value is " + entry.getValue());
		}
		
		System.out.println("....................................");
		
		for(Map.Entry<String, Integer> entry : maps.entrySet()) {
			System.out.println("Key is " +entry.getKey() + " Value is " + entry.getValue());
		}
		
		System.out.println("....................................");
		
		for(Map.Entry<String,Integer> entry: maps3.entrySet()) {
			System.out.println("Key is " +entry.getKey() + " Value is " + entry.getValue());
		}
		
		System.out.println(maps.containsKey("Chathu"));
	}

}
