package CollectionsExamples;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> kids = new PriorityQueue<String>();
		kids.add("akil");
		kids.add("bhargav");
		kids.add("siddu");
		kids.add("akil");
		kids.add("tanmay");
		kids.add("jai");
		kids.remove();
		kids.poll();
		System.out.println("super "+ kids.peek());
		
		for(String s : kids){
			System.out.println(s);
		}
	}

}
