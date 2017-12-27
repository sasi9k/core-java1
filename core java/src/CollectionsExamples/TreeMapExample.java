package CollectionsExamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
	TreeMap<Integer, String> sasi = new TreeMap<Integer, String>();
	sasi.put(5, "Brain");
	sasi.put(1, "eyes");
	sasi.put(2, "nose");
	sasi.put(3, "ears");
	sasi.put(4, "heart");
	
	Set set = sasi.entrySet();
	Iterator itr = set.iterator();
	while(itr.hasNext()){
		Map.Entry<Integer, String> e = (Map.Entry)itr.next();
		System.out.println(e);
	}

	}

}
