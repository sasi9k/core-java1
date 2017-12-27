package CollectionsExamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> toys = new HashSet<String>();
		toys.add("doll");
		toys.add("car");
		toys.add("wepons");
		toys.add("bike");
		toys.add("car");
		toys.add("carecters");
		
		for( String s: toys){
			System.out.println(s);
		}

	}

}
