package CollectionsExamples;

import java.util.Enumeration;
import java.util.Vector;

class toppers{
	int rank;
	String name;
	
toppers(int rank, String name)	{
	this.rank=rank;
	this.name=name;
}

public String toString(){
	return rank+ " "+name;
}
}

public class VectorExample {

	public static void main(String[] args) {
		
		toppers t1 = new toppers(3, "sasi");
		toppers t2 = new toppers(2, "john");
		toppers t3 = new toppers(1, "smith");
		
		Vector<toppers> t = new Vector<toppers>();
		
		t.addElement(t1);
		t.addElement(t2);
		t.addElement(t3);
		
		Enumeration e = t.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
	}
}
