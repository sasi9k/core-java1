package CollectionsExamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> girls = new TreeSet<String>();
		girls.add("anusha");
		girls.add("ramya");
		girls.add("vizya");
		girls.add("neha");
		girls.add("anjusha");
		girls.add("anusha");
		girls.clone();
		Iterator itr = girls.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}
}
