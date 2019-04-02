package divider;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ExamplQueue {

	public static void main(String[] args) {
		
		
		Queue<String> queue = new LinkedList<>();
		queue.add("a");
		queue.add("Z");
		queue.add("K");
		queue.add("k");
		queue.add("q");
		queue.offer("r");
		queue.offer("r");
		queue.offer("r");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek());
		
		
		for (String string : queue) {
			System.out.println(string);
		}
		
		System.out.println("...........................................");
		
		
		Deque<String> qu = new LinkedList<>();
			
		qu.add("z");
		qu.offer("h");
		qu.addFirst("First");
		qu.addLast("Last");
		
		for (String string : qu) {
			System.out.println(string);
		}
		
		
	}

}
