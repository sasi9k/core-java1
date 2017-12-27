package CollectionsExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {

	public static void main(String[] args) {
		Deque<String> izeal = new ArrayDeque<String>();
		izeal.add("gowtham");
		izeal.add("siddu");
		izeal.add("rajeev");
		izeal.add("echu");
		izeal.add("siddu");
		izeal.addFirst("sasi");
		
		for(String s: izeal){
			System.out.println(s);
		}
		

	}

}
