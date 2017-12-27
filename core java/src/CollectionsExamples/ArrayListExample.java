package CollectionsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	private static final String String = null;

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("sasi");
		students.add("sai");
		students.add("peter");
		students.add("smith");
		students.clear();
		students.add("john");
		students.add("sai");
		
		List<String> staff = new ArrayList<String>();
		staff.add("sait");
		staff.add("mnp");
		
		students.addAll(staff);
		students.remove("mnp");
		
		
		System.out.println(students.size());
		
		System.out.println(students);
		
		 Iterator itr = students.iterator();
		while(itr.hasNext()){  
			String s = (String) itr.next();
			
			if (s.equals("john")){
				itr.remove();
			
		
			
		for (String p : students){
			
			
			System.out.println(p);

	}
	
		
	
			    
			  System.out.println(students);
		}
		
	
		
		
	
		 
		}
	}
}

