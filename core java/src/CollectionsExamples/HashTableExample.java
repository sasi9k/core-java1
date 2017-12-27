package CollectionsExamples;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer,String> cartoons = new Hashtable<Integer,String>();
		cartoons.put(1, "popeye");
		cartoons.put(2, "tom");
		cartoons.put(3, "jerry");
		cartoons.put(4, "pokemon");
		cartoons.put(5, "bubleguppy");
		
		Set set = cartoons.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry pok = (Map.Entry)itr.next();
			System.out.println(pok.getKey()+""+pok.getValue());
		}
		
		

	}

}
