package CollectionsExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

class fruits{
	int cost;
	
	String name;
 fruits(int cost, String name){
	 this.cost= cost;
	 this.name= name;
	 
		
	}
 public String toString(){
	 return cost +" "+ name;
	 
 }
}

public class LinkedHashSetExample {
	public static void main(String[] args) {
		
	
		
	fruits f1 = new fruits(50, "apple");
	fruits f2 = new fruits(20,"");
	fruits f3 = new fruits(70,"grapes");
	LinkedHashSet<fruits> f = new LinkedHashSet<fruits>();
	
	f.add(f1);
	f.add(f2);
	f.add(f3);
Iterator<fruits> itr =  f.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
	
		
	}

}
