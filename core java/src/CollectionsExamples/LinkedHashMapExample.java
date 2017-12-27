package CollectionsExamples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



class Books{
	int year;
	String author;
	String name;
  Books(int year, String author, String name){
		this.year = year;
		this.author = author;
		this.name = name;
		
	}
  public String toString(){
	return author+""+year+""+name;
	
	  
  }
}

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, Books> n = new LinkedHashMap<Integer,Books>();
		Books b1 = new Books(2009,"sasi","smart");
		Books b2 = new Books(2009,"sai","sweet");
		Books b3 = new Books(2009,"mat","salt");
		Books b4 = new Books(2009,"got","sour");
		n.put(1, b1);
		n.put(2, b2);
		n.put(3, b3);
		n.put(4, b4);
		
		Set set=n.entrySet(); 
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	       	    	//Entry<Integer, String> entry=(Entry<Integer, String>) itr.next(); 
	    	Map.Entry me = (Map.Entry)itr.next();
	    	
	        System.out.println(me.getKey());  
	        System.out.println(me.getValue());
	    }  
		/*for(Entry<Integer, Books> m: n.entrySet()){  
			   System.out.println(m);  
			  }  */
	}

}
