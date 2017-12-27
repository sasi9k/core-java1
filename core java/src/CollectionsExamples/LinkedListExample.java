package CollectionsExamples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
public static void main(String[] args) {
	List<String> heros = new LinkedList<String>();
	heros.add("NTR");
	heros.add("Balaya Babu");
	heros.add("Mahesh");
	heros.add("allari Naresh");
	heros.add("NTR");
	
	int su = Collections.binarySearch(heros, "allari Naresh");
	System.out.println("i am su "+  su);
	for( String s: heros){
		System.out.println(s);
	}
}
}
