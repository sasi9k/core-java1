package CollectionsExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
	HashMap<Integer, String> students = new HashMap<Integer, String>();
	//Collections.synchronizedMap(students);
	
	students.put(7, "abd");
	students.put(9, "nan");
	students.put(13, "smith");
	students.put(4, "sub");
	students.put(345, "edd");
	
	//System.out.println(students);
	
	for (Map.Entry m : students.entrySet()){
	System.out.println( m );	
	}
	Map<Integer, String> s = new TreeMap<Integer, String>(students);
	Set se = s.entrySet();
	Iterator ite = se.iterator();
	while(ite.hasNext()){
		Map.Entry<Integer, String> me =(Map.Entry<Integer, String>)ite.next();
		
		System.out.println(me.getValue());
		
	}
	

	}

}
